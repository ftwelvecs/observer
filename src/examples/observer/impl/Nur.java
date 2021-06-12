package examples.observer.impl;

import examples.observer.NewsDTO;
import examples.observer.api.Publisher;
import examples.observer.api.Subscriber;

public class Nur extends Publisher {

    public void notifySubscribers() {
        // Создаем новость
        NewsDTO newsDTO = new NewsDTO(
                "Nur",
                "Нигматулин: Мажилис рассмотрит международные соглашения ЕАЭС",
                "Под председательством спикера Палаты Нурлана Нигматулина состоялось" +
                        " заседание Бюро Мажилиса, на котором сформирован проект повестки" +
                        " предстоящего пленарного заседания депутатов.");

        for (Subscriber s : subscribers) {
            s.update(newsDTO);
        }
    }
}
