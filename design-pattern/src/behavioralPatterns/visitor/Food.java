package behavioralPatterns.visitor;

public class Food implements Product {
    @Override
    public void accept(DiscountVisitor visitor) {
        visitor.visitFood(this);
    }
}
