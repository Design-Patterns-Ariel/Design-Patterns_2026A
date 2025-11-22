package Week01;

public class Server {

    private static Server instance;

    private String host;
    private int port;

    private Server(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public static Server getInstance(){
        if (instance == null)
            instance = new Server("local",3000);
        return instance;
    }

}
