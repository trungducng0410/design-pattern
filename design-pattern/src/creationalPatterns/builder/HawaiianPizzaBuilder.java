package creationalPatterns.builder;

public class HawaiianPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildSize() {
        pizza.setSize("Large");
    }

    @Override
    public void buildCrust() {
        pizza.setCrust("Thin");
    }

    @Override
    public void buildToppings() {
        pizza.setToppings("Ham and Pineapple");
    }
}
