package examples.observer;

import examples.observer.api.Subscriber;

public class NurReader implements Subscriber {

    public void update(NewsDTO newsDTO) {
        System.out.println("NurReader читает: " + newsDTO.getPublisherName());
    }
}
