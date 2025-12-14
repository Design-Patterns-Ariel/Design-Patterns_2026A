package Chat;

public interface ObserverSystem {

    /**
     * Registers a new observer to receive system notifications.
     *
     * @param observer The observer to register.
     */
    void addObserver(NotificationObserver observer);

    /**
     * Unregisters an observer so it will no longer receive notifications.
     *
     * @param observer The observer to remove.
     */
    void removeObserver(NotificationObserver observer);

    /**
     * Notifies all currently registered observers with the given message.
     *
     * @param message The message to send.
     */
    void notifyObservers(String message);
}
