package behavioralPatterns.templateMethod;

public class CSVReportGenerator extends ReportGenerator {
    protected String collectData() {
        return "CSV Data";
    }

    protected String processData(String data) {
        return "Processed " + data;
    }

    protected String formatReport(String processedData) {
        return "CSV Report: " + processedData;
    }
}
