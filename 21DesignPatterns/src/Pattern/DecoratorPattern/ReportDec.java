package Pattern.DecoratorPattern;

public class ReportDec extends ConcReport{
    protected Report report;

    public ReportDec(Report report) {
        this.report = report;
    }

    public void generateReport() {
        report.generateReport();
    }

}
