package behavioralPatterns.visitor;

public interface Product {
    void accept(DiscountVisitor visitor);
}
