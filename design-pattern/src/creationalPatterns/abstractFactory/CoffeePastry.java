package creationalPatterns.abstractFactory;

public class CoffeePastry implements Pastry {
    @Override
    public void serve() {
        System.out.println("Serving Croissant");
    }
}
