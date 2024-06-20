package structuralPatterns.decorator;

// Concrete component
public class PlainPizza implements Pizza {
    @Override
    public int getCost() {
        return 1;
    }

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }
}
