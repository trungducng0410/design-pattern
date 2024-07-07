package behavioralPatterns.visitor;

public class ClearanceDiscountVisitor implements DiscountVisitor {
    public void visitFood(Food food) {
        System.out.println("Applying clearance discount to food.");
    }
    public void visitClothing(Clothing clothing) {
        System.out.println("Applying clearance discount to clothing.");
    }
    public void visitElectronics(Electronics electronics) {
        System.out.println("Applying clearance discount to electronics.");
    }
}
