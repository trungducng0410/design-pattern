package behavioralPatterns.state;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.publish();
        doc.approve();
    }
}
