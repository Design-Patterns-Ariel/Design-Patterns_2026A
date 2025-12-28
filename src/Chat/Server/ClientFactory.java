package Chat.Server;

public class ClientFactory {

    public static ClientRole createClient(String type) {

        if (type == null) {
            return new RegularClient();
        }

        switch (type.toUpperCase()) {
            case "ADMIN":
                return new AdminClient();
            case "REGULAR":
            default:
                return new RegularClient();
        }
    }
}
