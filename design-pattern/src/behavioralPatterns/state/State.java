package behavioralPatterns.state;

public interface State {
    void publish(Document doc);
    void approve(Document doc);
}
