package examples.observer.impl;

import examples.observer.NewsDTO;
import examples.observer.api.Publisher;
import examples.observer.api.Subscriber;

public class Zakon extends Publisher {

    public void notifySubscribers() {
        // Создаем новость
        NewsDTO newsDTO = new NewsDTO(
                "Zakon",
                "Долю зеленой энергетики доведут до 15% в Казахстане",
                "По данным primeminister.kz, рассмотрены вопросы развития" +
                        " возобновляемых источников энергии, перехода РК к низкоуглеродной" +
                        " экономике, а также потенциал сотрудничества в процессе декарбонизации.");

        for (Subscriber s : subscribers) {
            s.update(newsDTO);
        }
    }
}
