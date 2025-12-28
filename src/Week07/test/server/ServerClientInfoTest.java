package Week07.test.server;

import Chat.Server.RegularClient;
import Chat.Server.ServerClientInfo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServerClientInfoTest {

    @Test
    void buildClient_withValidData_shouldSucceed() {
        ServerClientInfo client = new ServerClientInfo.Builder()
                .setFirstName("John")
                .setLastName("Doe")
                .setEmail("john@doe.com")
                .setRole(new RegularClient())
                .setWantsNotifications(true)
                .build();

        assertNotNull(client);
        assertEquals("John", client.getFirstName());
        assertEquals("Doe", client.getLastName());
        assertEquals("john@doe.com", client.getEmail());
    }

    @Test
    void buildClient_withEmptyFirstName_shouldThrowException() {
        // TODO: IllegalArgumentException
    }

    @Test
    void buildClient_withInvalidEmail_shouldThrowException() {
        // TODO
    }

    @Test
    void buildClient_withoutRole_shouldThrowException() {
        // TODO
    }
}
