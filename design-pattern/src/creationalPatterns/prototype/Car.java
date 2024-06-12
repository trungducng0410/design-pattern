package creationalPatterns.prototype;

public abstract class Car implements Cloneable {

    protected String model;
    protected String color;

    public abstract void customize(String color, String accessories);

    @Override
    public Car clone() {
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
