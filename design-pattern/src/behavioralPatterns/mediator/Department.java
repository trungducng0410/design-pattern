package behavioralPatterns.mediator;

public interface Department {
    void setMediator(DepartmentMediator mediator);
    void sendMessage(String message);
    void receiveMessage(String message);
}
