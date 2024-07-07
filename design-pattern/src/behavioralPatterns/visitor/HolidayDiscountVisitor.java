package behavioralPatterns.visitor;

public class HolidayDiscountVisitor implements DiscountVisitor {
    public void visitFood(Food food) {
        System.out.println("Applying holiday discount to food.");
    }
    public void visitClothing(Clothing clothing) {
        System.out.println("Applying holiday discount to clothing.");
    }
    public void visitElectronics(Electronics electronics) {
        System.out.println("Applying holiday discount to electronics.");
    }
}
