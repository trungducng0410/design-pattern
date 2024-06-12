package creationalPatterns.builder;

public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder builder) {
        pizzaBuilder = builder;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildSize();
        pizzaBuilder.buildCrust();
        pizzaBuilder.buildToppings();
    }
}
