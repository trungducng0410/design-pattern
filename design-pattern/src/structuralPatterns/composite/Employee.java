package structuralPatterns.composite;

// Leaf
public class Employee implements OrganizationComponent {
    private String name;
    private int hours;

    public Employee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getHours() {
        return this.hours;
    }
}
