package examples.observer;

import examples.observer.api.Subscriber;

public class NewsReader implements Subscriber {
    public void update(NewsDTO newsDTO) {
        if (newsDTO.getPublisherName().equals("Tengrinews")) {
            System.out.println("NewsReader читает: " + newsDTO.getPublisherName());
        } else if (newsDTO.getPublisherName().equals("Zakon")) {
            System.out.println("NewsReader читает: " + newsDTO.getPublisherName());
        } else if (newsDTO.getPublisherName().equals("Nur")) {
            System.out.println("NewsReader читает: " + newsDTO.getPublisherName());
        } else {
            System.out.println("Я на такое не подписывался!");
        }
    }

    public class TengrinewsReader implements Subscriber {
        public void update(NewsDTO newsDTO) {
            System.out.println("[Inner] TengrinewsReader читает: " + newsDTO.getPublisherName());
        }
    }

    public class ZakonReader implements Subscriber {
        public void update(NewsDTO newsDTO) {
            System.out.println("[Inner] ZakonReader читает: " + newsDTO.getPublisherName());
        }
    }

    public class NurReader implements Subscriber {
        public void update(NewsDTO newsDTO) {
            System.out.println("[Inner] NurReader читает: " + newsDTO.getPublisherName());
        }
    }
}
