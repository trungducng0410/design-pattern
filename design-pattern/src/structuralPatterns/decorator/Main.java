package structuralPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();

        System.out.println("Cost: " + pizza.getCost());
        System.out.println("Description: " + pizza.getDescription());


        pizza = new CheeseDecorator(pizza);

        System.out.println("Cost: " + pizza.getCost());
        System.out.println("Description: " + pizza.getDescription());

        pizza = new PepperoniDecorator(pizza);

        System.out.println("Cost: " + pizza.getCost());
        System.out.println("Description: " + pizza.getDescription());
    }
}
