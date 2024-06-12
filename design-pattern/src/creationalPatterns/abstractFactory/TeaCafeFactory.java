package creationalPatterns.abstractFactory;

public class TeaCafeFactory implements CafeFactory {
    @Override
    public Drink createDrink() {
        return new TeaDrink();
    }

    @Override
    public Pastry createPastry() {
        return new TeaPastry();
    }
}
