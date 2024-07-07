package behavioralPatterns.mediator;

public class OfficeMediator implements DepartmentMediator {
    Department hr;
    Department finance;
    Department technical;

    public void setHr(Department hr) {
        this.hr = hr;
    }

    public void setFinance(Department finance) {
        this.finance = finance;
    }

    public void setTechnical(Department technical) {
        this.technical = technical;
    }

    @Override
    public void communicate(String message, Department department) {
        if (department instanceof HRDepartment) {
            finance.receiveMessage(message);
            technical.receiveMessage(message);
        } else if (department instanceof FinanceDepartment) {
            hr.receiveMessage(message);
            technical.receiveMessage(message);
        } else if (department instanceof TechnicalDepartment) {
            hr.receiveMessage(message);
            finance.receiveMessage(message);
        }
    }
}
