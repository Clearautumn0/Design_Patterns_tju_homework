package Pattern.DecoratorPattern;

public class HeaderDecorator extends ReportDec{
    public HeaderDecorator(Report report) {
        super(report);
    }

    @Override
    public void generateReport() {
        System.out.println("-------Header-------");
        super.generateReport();
    }

}
