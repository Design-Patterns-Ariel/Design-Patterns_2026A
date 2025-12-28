package Week07.test.server;

import Chat.Server.AdminClient;
import Chat.Server.ClientFactory;
import Chat.Server.ClientRole;
import Chat.Server.RegularClient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClientFactoryTest {

    @Test
    void createAdminClient_shouldReturnAdmin() {
        ClientRole role = ClientFactory.createClient("ADMIN");
        assertInstanceOf(AdminClient.class, role);
    }

    @Test
    void createRegularClient_shouldReturnRegular() {
        ClientRole role = ClientFactory.createClient("REGULAR");
        assertInstanceOf(RegularClient.class, role);
    }

    @Test
    void createClient_withInvalidType_shouldReturnRegularByDefault() {
        // TODO
    }

    @Test
    void createClient_withNull_shouldReturnRegular() {
        // TODO
    }
}
