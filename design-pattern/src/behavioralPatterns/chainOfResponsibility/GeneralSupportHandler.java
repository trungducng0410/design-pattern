package behavioralPatterns.chainOfResponsibility;

public class GeneralSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(QueryType queryType, String message) {
        if (queryType.equals(QueryType.GENERAL)) {
            System.out.println("General Support: Handling query - " + message);
        } else if (this.getNextHandler() != null) {
            this.getNextHandler().handleRequest(queryType, message);
        }
    }
}
