package Week07.test.server;

import Chat.NotificationObserver;
import Chat.NotificationSystem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestObserver implements NotificationObserver {

    String lastMessage;

    @Override
    public void onNotify(String message) {
        lastMessage = message;
    }
}

public class NotificationSystemTest {

    @Test
    void observerShouldReceiveNotification() {
        NotificationSystem system = new NotificationSystem();
        TestObserver observer = new TestObserver();

        system.addObserver(observer);
        system.notifyObservers("Test message");

        assertEquals("Test message", observer.lastMessage);
    }

    @Test
    void removedObserverShouldNotReceiveNotification() {
        // TODO
    }

    @Test
    void multipleObserversShouldAllReceiveNotification() {
        // TODO
    }
}
