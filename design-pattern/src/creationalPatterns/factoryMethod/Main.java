package creationalPatterns.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Shape hexagon = ShapeFactory.getShape("Hexagon");
        hexagon.draw();

        Shape pentagon = ShapeFactory.getShape("Pentagon");
        pentagon.draw();
    }
}
