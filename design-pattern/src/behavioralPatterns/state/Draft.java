package behavioralPatterns.state;

public class Draft implements State {
    @Override
    public void publish(Document doc) {
        System.out.println("Publishing draft, moving to moderation.");
        doc.setState(new Moderation());
    }

    @Override
    public void approve(Document doc) {
        System.out.println("Draft cannot be approved directly.");
    }
}
