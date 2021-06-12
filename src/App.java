import examples.observer.*;
import examples.observer.api.Publisher;
import examples.observer.api.Subscriber;
import examples.observer.impl.Nur;
import examples.observer.impl.Tengrinews;
import examples.observer.impl.Zakon;

public class App {
    public static void main(String[] args) {
        // Сначало создаем издателей
        Publisher tengrinews = new Tengrinews();
        Publisher zakon = new Zakon();
        Publisher nur = new Nur();

        // создаем читателя новостей
        NewsReader reader = new NewsReader();

        // Пример #1
        // подписываемся на издателей
        tengrinews.addSubscriber(reader);
        zakon.addSubscriber(reader);
        nur.addSubscriber(reader);

        // Пример #2
        tengrinews.addSubscriber(new TengrinewsReader());
        zakon.addSubscriber(new ZakonReader());
        nur.addSubscriber(new NurReader());

        // Пример #3 (Внутренние классы)
        tengrinews.addSubscriber(reader.new TengrinewsReader());
        zakon.addSubscriber(reader.new ZakonReader());
        nur.addSubscriber(reader.new NurReader());

        // Пример #4 (Анонимные классы)
        tengrinews.addSubscriber(new Subscriber() {
            public void update(NewsDTO newsDTO) {
                System.out.println("Anonymous class читает: " + newsDTO.getPublisherName());
            }
        });
        zakon.addSubscriber(new Subscriber() {
            public void update(NewsDTO newsDTO) {
                System.out.println("Anonymous class читает: " + newsDTO.getPublisherName());
            }
        });
        nur.addSubscriber(new Subscriber() {
            public void update(NewsDTO newsDTO) {
                System.out.println("Anonymous class читает: " + newsDTO.getPublisherName());
            }
        });

        // Пример #5 (Лямбда классы)
        tengrinews.addSubscriber(newsDTO ->
            System.out.println("Lambda exp читает: " + newsDTO.getPublisherName())
        );
        nur.addSubscriber(newsDTO ->
                System.out.println("Lambda exp читает: " + newsDTO.getPublisherName())
        );
        zakon.addSubscriber(newsDTO ->
                System.out.println("Lambda exp читает: " + newsDTO.getPublisherName())
        );

        // Пример #6
        // Создание объекта через анонимный класс
        Subscriber anonymous = new Subscriber() {
            public void update(NewsDTO newsDTO) {
            }
        };

        // Создание объекта через лямбда выражение
        Subscriber lambda = (newsDTO) -> {};

        // Оба примера идентичны

        // уведомляем читателей
        tengrinews.notifySubscribers();
        zakon.notifySubscribers();
        nur.notifySubscribers();
    }
}
