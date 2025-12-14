package Chat;

import java.util.ArrayList;
import java.util.List;

public class NotificationSystem implements ObserverSystem {

    private final List<NotificationObserver> observers = new ArrayList<>();

    @Override
    public synchronized void addObserver(NotificationObserver observer) {
        if (observer == null) {
            return;
        }
        observers.add(observer);
    }

    @Override
    public synchronized void removeObserver(NotificationObserver observer) {
        observers.remove(observer);
    }

    @Override
    public synchronized void notifyObservers(String message) {
        for (NotificationObserver observer : observers) {
            observer.onNotify(message);
        }
    }
}
