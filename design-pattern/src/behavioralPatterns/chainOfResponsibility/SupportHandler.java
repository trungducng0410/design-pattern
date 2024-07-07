package behavioralPatterns.chainOfResponsibility;

public abstract class SupportHandler {
    private SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public SupportHandler getNextHandler() {
        return nextHandler;
    }

    public abstract void handleRequest(QueryType queryType, String message);
}
