package examples.observer.impl;

import examples.observer.NewsDTO;
import examples.observer.api.Publisher;
import examples.observer.api.Subscriber;

public class Tengrinews extends Publisher {

    // уведомляем всех подписчиков
    public void notifySubscribers() {
        // Создаем новость
        NewsDTO newsDTO = new NewsDTO(
                "Tengrinews",
                "Как будет выглядеть новый пляж в Нур-Султане",
                "Появились эскизы нового пляжа в Нур-Султане. Искусственный пляж с бассейнами" +
                        " появится на набережной реки Есиль в Триатлон-парке близ моста по улице Сарайшык," +
                        " передает корреспондент Tengrinews.kz.");

        for (Subscriber s : subscribers) {
            s.update(newsDTO);
        }
    }
}
