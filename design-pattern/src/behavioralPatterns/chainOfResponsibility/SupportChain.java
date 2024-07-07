package behavioralPatterns.chainOfResponsibility;

public class SupportChain {
    public static SupportHandler getSupportChain() {
        SupportHandler technicalSupport = new TechnicalSupportHandler();
        SupportHandler billingSupport = new BillingSupportHandler();
        SupportHandler generalSupport = new GeneralSupportHandler();

        technicalSupport.setNextHandler(billingSupport);
        billingSupport.setNextHandler(generalSupport);

        return technicalSupport;
    }
}
