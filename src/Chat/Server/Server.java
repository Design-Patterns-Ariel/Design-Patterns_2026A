package Chat.Server;

import Chat.NotificationSystem;
import Chat.ObserverSystem;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    private final int port;
    private final ObserverSystem observerSystem;
    private final List<SocketHandler> clients;

    public Server(int port) {
        this.port = port;
        this.observerSystem = new NotificationSystem();
        this.clients = new ArrayList<>();
    }

    public synchronized void addClient(SocketHandler handler, ServerClientInfo info) {
        clients.add(handler);
        if (info.isWantsNotifications()) {
            observerSystem.addObserver(handler);
        }
        System.out.println("New client connected: " + info);
    }

    public synchronized void removeClient(SocketHandler handler) {
        clients.remove(handler);
        observerSystem.removeObserver(handler);
        System.out.println("Client disconnected: " + handler.getClientLabel());
    }

    public synchronized void broadcast(String message, SocketHandler from) {
        for (SocketHandler handler : clients) {
            if (handler != from) {
                handler.sendMessage(message);
            }
        }
    }

    public void notifyAllObservers(String systemMessage) {
        observerSystem.notifyObservers(systemMessage);
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started on port " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                SocketHandler handler = new SocketHandler(socket, this);
                handler.start();
            }

        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
            notifyAllObservers("System error: server shutting down.");
        } finally {
            notifyAllObservers("Server is shutting down, connection will be closed.");
        }
    }

    public static void main(String[] args) {
        Server server = new Server(5000);
        server.start();
    }
}
