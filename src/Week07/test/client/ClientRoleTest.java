package Week07.test.client;

import Chat.Server.AdminClient;
import Chat.Server.ClientRole;
import Chat.Server.RegularClient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClientRoleTest {

    @Test
    void adminClient_shouldBeAdmin() {
        ClientRole admin = new AdminClient();
        assertTrue(admin.isAdmin());
    }

    @Test
    void regularClient_shouldNotBeAdmin() {
        ClientRole regular = new RegularClient();
        assertFalse(regular.isAdmin());
    }

    @Test
    void adminRoleName_shouldBeAdmin() {
        // TODO
    }

    @Test
    void regularRoleName_shouldBeRegular() {
        // TODO: השלם בדיקה
    }
}

