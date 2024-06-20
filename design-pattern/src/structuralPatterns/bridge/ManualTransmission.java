package structuralPatterns.bridge;

// Concrete implementor
public class ManualTransmission implements Transmission {
    @Override
    public void applyGear() {
        System.out.println("Manual transmission applied.");
    }
}
