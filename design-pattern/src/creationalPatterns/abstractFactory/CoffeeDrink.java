package creationalPatterns.abstractFactory;

public class CoffeeDrink implements Drink {
    @Override
    public void serve() {
        System.out.println("Serving Coffee");
    }
}
