package structuralPatterns.bridge;

public class Main {
    public static void main(String[] args) {
        Transmission manual = new ManualTransmission();
        Vehicle car = new Car(manual);
        car.applyTransmission();
    }
}
