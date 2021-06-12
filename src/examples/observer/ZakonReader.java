package examples.observer;

import examples.observer.api.Subscriber;

public class ZakonReader implements Subscriber {

    public void update(NewsDTO newsDTO) {
        System.out.println("ZakonReader читает: " + newsDTO.getPublisherName());
    }
}
