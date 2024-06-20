package structuralPatterns.bridge;

public class AutomaticTransmission implements Transmission {
    @Override
    public void applyGear() {
        System.out.println("Automatic transmission applied.");
    }
}
