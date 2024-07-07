package behavioralPatterns.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        SupportHandler supportChain = SupportChain.getSupportChain();
        supportChain.handleRequest(QueryType.TECHNICAL, "I can't connect to the internet.");
        supportChain.handleRequest(QueryType.BILLING, "I have a question about my invoice.");
        supportChain.handleRequest(QueryType.GENERAL, "Thank you for your service.");
    }
}
