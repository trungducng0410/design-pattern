package structuralPatterns.adapter;

// Adaptee
public class FrenchSpeaker {
    public void speakFrench(String message) {
        System.out.println("Speaking in French: " + message);
    }
}
