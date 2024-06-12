package creationalPatterns.abstractFactory;

public class TeaDrink implements Drink {
    @Override
    public void serve() {
        System.out.println("Serving Tea");
    }
}
