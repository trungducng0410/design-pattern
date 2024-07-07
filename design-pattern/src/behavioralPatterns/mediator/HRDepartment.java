package behavioralPatterns.mediator;

public class HRDepartment implements Department {
    DepartmentMediator mediator;

    @Override
    public void setMediator(DepartmentMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        mediator.communicate(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("HR received message: " + message);
    }
}
