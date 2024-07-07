package behavioralPatterns.chainOfResponsibility;

public class BillingSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(QueryType queryType, String message) {
        if (queryType.equals(QueryType.BILLING)) {
            System.out.println("Billing Support: Handling query - " + message);
        } else if (this.getNextHandler() != null) {
            this.getNextHandler().handleRequest(queryType, message);
        }
    }
}
