package creationalPatterns.prototype;

public class Main {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        Car customerCar = basicCar.clone();

        customerCar.customize("Red", "Sunroof");
    }
}
