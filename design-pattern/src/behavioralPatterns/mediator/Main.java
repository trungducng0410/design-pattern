package behavioralPatterns.mediator;

public class Main {
    public static void main(String[] args) {
        OfficeMediator mediator = new OfficeMediator();
        Department hr = new HRDepartment();
        Department finance = new FinanceDepartment();
        Department technical = new TechnicalDepartment();

        mediator.setHr(hr);
        mediator.setFinance(finance);
        mediator.setTechnical(technical);

        hr.setMediator(mediator);
        finance.setMediator(mediator);
        technical.setMediator(mediator);

        hr.sendMessage("HR update for all departments");

    }
}
