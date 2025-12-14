package Chat.Client;


public class TCPClient {

    public static void main(String[] args) {
        String host = "localhost";
        int port = 5000;

        Client client = new Client(host, port);
        client.start();
    }
}
