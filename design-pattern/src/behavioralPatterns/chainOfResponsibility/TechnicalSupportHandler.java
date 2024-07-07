package behavioralPatterns.chainOfResponsibility;

public class TechnicalSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(QueryType queryType, String message) {
        if (queryType.equals(QueryType.TECHNICAL)) {
            System.out.println("Technical Support: Handling query - " + message);
        } else if (this.getNextHandler() != null) {
            this.getNextHandler().handleRequest(queryType, message);
        }
    }
}
