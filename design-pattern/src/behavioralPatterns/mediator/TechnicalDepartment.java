package behavioralPatterns.mediator;

public class TechnicalDepartment implements Department {
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
        System.out.println("Technical received message: " + message);
    }
}
