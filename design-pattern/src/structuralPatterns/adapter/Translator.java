package structuralPatterns.adapter;

// Adapter
public class Translator implements EnglishSpeaker {
    private final FrenchSpeaker frenchSpeaker;

    public Translator(FrenchSpeaker frenchSpeaker) {
        this.frenchSpeaker = frenchSpeaker;
    }

    @Override
    public void speakEnglish(String message) {
        String frenchMessage = translateToFrench(message);
        frenchSpeaker.speakFrench(frenchMessage);
    }

    private String translateToFrench(String message) {
        return message.replace("Hello", "Bonjour").replace("Thank you", "Merci");
    }
}
