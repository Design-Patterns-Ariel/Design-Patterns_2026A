package Week01;

public class Main {
    public static void main(String[] args) {

    /*    Server s = new Server();
        Server s1 = new Server();*/

        Server server = Server.getInstance();
        Server server1 = Server.getInstance();
        Server server2 = Server.getInstance();
        Server server3 = Server.getInstance();

        System.out.println(server);
        System.out.println(server1);
        System.out.println(server2);


        // db = new db("")
        for (int i = 0; i < 10; i++) {
            System.out.println(Server.getInstance());
        }
        System.out.println("-----------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(Server.egetInstance());
        }
    }
}
