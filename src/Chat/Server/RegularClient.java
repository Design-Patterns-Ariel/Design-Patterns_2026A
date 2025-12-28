package Chat.Server;

public class RegularClient implements ClientRole {

    @Override
    public String getRoleName() {
        return "REGULAR";
    }

    @Override
    public boolean isAdmin() {
        return false;
    }

    @Override
    public void onMessage(String message, Server server, SocketHandler sender) {
        server.broadcast(sender.getClientLabel() + ": " + message, sender);
    }
}

