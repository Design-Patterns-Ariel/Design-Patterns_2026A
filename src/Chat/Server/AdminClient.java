package Chat.Server;

public class AdminClient implements ClientRole {

    @Override
    public String getRoleName() {
        return "ADMIN";
    }

    @Override
    public boolean isAdmin() {
        return true;
    }

    @Override
    public void onMessage(String message, Server server, SocketHandler sender) {


        if (message.startsWith("/system ")) {
            String systemMessage = message.substring(8);
            server.notifyAllObservers("ADMIN MESSAGE: " + systemMessage);
            return;
        }

        server.broadcast("[ADMIN] " + sender.getClientLabel() + ": " + message, sender);
    }
}
