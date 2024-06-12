package creationalPatterns.abstractFactory;

public class Main {
    public static void main(String[] args) {
        // Creating a coffee cafe
        CafeFactory coffeeFactory = new CoffeeCafeFactory();
        Drink coffee = coffeeFactory.createDrink();
        Pastry croissant = coffeeFactory.createPastry();

        coffee.serve();
        croissant.serve();

        // Creating a tea cafe
        CafeFactory teaFactory = new TeaCafeFactory();
        Drink tea = teaFactory.createDrink();
        Pastry scone = teaFactory.createPastry();

        tea.serve();
        scone.serve();
    }
}
