package examples.observer.api;

import examples.observer.NewsDTO;

public interface Subscriber {
    void update(NewsDTO newsDTO);
    // Если раскомментировать вызовет ошибку
    // void anotherMethod();
}
