package Chat.Server;

public interface ClientRole {

    /**
     * @return textual role name (ADMIN / REGULAR)
     */
    String getRoleName();

    /**
     * Called when the client sends a chat message.
     */
    void onMessage(String message, Server server, SocketHandler sender);

    /**
     * @return true if client has admin permissions
     */
    boolean isAdmin();
}
