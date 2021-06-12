package examples.observer.api;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {

    protected List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    // уведомляем всех подписчиков
    public abstract void notifySubscribers();
}
