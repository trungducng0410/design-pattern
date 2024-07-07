package behavioralPatterns.templateMethod;

public class Main {
    public static void main(String[] args) {
        ReportGenerator csvReport = new CSVReportGenerator();
        csvReport.generateReport();
    }
}
