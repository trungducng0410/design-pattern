package creationalPatterns.abstractFactory;

public class TeaPastry implements Pastry {
    @Override
    public void serve() {
        System.out.println("Serving Scone");
    }
}
