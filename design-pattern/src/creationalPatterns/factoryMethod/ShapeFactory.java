package creationalPatterns.factoryMethod;

public class ShapeFactory {
    public static Shape getShape(String type) {
        if (type.equals("Hexagon")) {
            return new Hexagon();
        } else if (type.equals("Pentagon")) {
            return new Pentagon();
        } else {
            return null;
        }
    }
}
