package structuralPatterns.facade;

public class Memory {
    public void load(long position, String data) {
        System.out.println("Loading data into memory at position " + position + ".");
    }
}
