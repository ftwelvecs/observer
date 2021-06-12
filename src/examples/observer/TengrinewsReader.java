package examples.observer;

import examples.observer.api.Subscriber;

public class TengrinewsReader implements Subscriber {

    public void update(NewsDTO newsDTO) {
        System.out.println("TengrinewsReader читает: " + newsDTO.getPublisherName());
    }
}
