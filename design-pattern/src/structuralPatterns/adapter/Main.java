package structuralPatterns.adapter;

public class Main {
    public static void main(String[] args) {
        FrenchSpeaker frenchSpeaker = new FrenchSpeaker();
        EnglishSpeaker translator = new Translator(frenchSpeaker);
        EnglishClient client = new EnglishClient(translator);

        client.express("Hello! Thank you for the meeting");
    }
}
