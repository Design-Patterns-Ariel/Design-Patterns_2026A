package Chat;

public interface NotificationObserver {

    /**
     * Called by the notification system when a system message is broadcast.
     *
     * @param message The system message to be delivered to the observer.
     */
    void onNotify(String message);
}

