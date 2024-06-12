package creationalPatterns.prototype;

public class BasicCar extends Car {
    public BasicCar() {
        model = "Basic";
        color = "White";
    }

    @Override
    public void customize(String color, String accessories) {
        this.color = color;
        System.out.println("Car customized with color: " + color + " and accessories: " + accessories);
    }
}
