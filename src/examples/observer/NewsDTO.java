package examples.observer;

public class NewsDTO {
    private String publisherName;
    private String title;
    private String text;

    public NewsDTO(String publisherName, String title, String text) {
        this.publisherName = publisherName;
        this.title = title;
        this.text = text;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
