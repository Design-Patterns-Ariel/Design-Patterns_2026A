package Chat.Server;

import Chat.NotificationObserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketHandler extends Thread implements NotificationObserver {

    private final Socket socket;
    private final Server server;
    private PrintWriter out;
    private BufferedReader in;
    private ServerClientInfo clientInfo;

    public SocketHandler(Socket socket, Server server) {
        this.socket = socket;
        this.server = server;
    }

    public String getClientLabel() {
        if (clientInfo == null) {
            return "Unknown client";
        }
        return clientInfo.getFirstName() + " " + clientInfo.getLastName();
    }

    public void sendMessage(String message) {
        if (out != null) {
            out.println(message);
        }
    }

    @Override
    public void onNotify(String message) {
        sendMessage("[SYSTEM] " + message);
    }

    @Override
    public void run() {
        try {
            setupStreams();
            sendMessage("Welcome. Registration is required before joining the chat.");
            this.clientInfo = registerClient();

            server.addClient(this, clientInfo);
            sendMessage("Registration complete. You may now join the chat.");
            sendMessage("Type 'exit' to leave the chat.");

            handleChatLoop();

        } catch (Exception e) {
            if (out != null) {
                out.println("Registration failed: " + e.getMessage());
            }
        } finally {
            cleanup();
        }
    }

    private void setupStreams() throws IOException {
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    private ServerClientInfo registerClient() throws IOException {
        String firstName = askUntilValid(
                "Enter first name:",
                "Invalid first name. Please enter again:",
                this::isValidName
        );

        String lastName = askUntilValid(
                "Enter last name:",
                "Invalid last name. Please enter again:",
                this::isValidName
        );

        String email = askUntilValid(
                "Enter email:",
                "Invalid email. Please enter again:",
                this::isValidEmail
        );
        String roleInput = askUntilValid(
                "Select user type (REGULAR / ADMIN):l:",
                "Invalid type. Please enter REGULAR or ADMIN:",
                this::isValidRole
        );
        ClientRole role = ClientFactory.createClient(roleInput);
        out.println("Would you like to receive notifications? (YES/NO)");
        String ans = in.readLine();
        boolean wantsNotifications = ans != null && ans.equalsIgnoreCase("YES");

        return new ServerClientInfo.Builder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setWantsNotifications(wantsNotifications)
                .setRole(role)
                .build();
    }

    private String askUntilValid(String prompt, String errorPrompt, Validator validator) throws IOException {
        out.println(prompt);
        String value = in.readLine();
        while (!validator.isValid(value)) {
            out.println(errorPrompt);
            value = in.readLine();
        }
        return value;
    }

    private boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    private boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.indexOf('@') > 0;
    }

    private boolean isValidRole(String roleInput) {
        return roleInput == null ||
                !(roleInput.equalsIgnoreCase("REGULAR") || roleInput.equalsIgnoreCase("ADMIN"));
    }

    private void handleChatLoop() throws IOException {
        String line;
        while ((line = in.readLine()) != null) {

            if ("exit".equalsIgnoreCase(line.trim())) {
                sendMessage("You have left the chat.");
                break;
            }
            String msg = getClientLabel() + ": " + line;
            System.out.println(msg);
            clientInfo.getRole().onMessage(line, server, this);
        }
    }

    private void cleanup() {
        try {
            server.removeClient(this);
        } catch (Exception ignored) {
        }
        try {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        } catch (IOException ignored) {
        }
    }

    private interface Validator {
        boolean isValid(String value);
    }
}

