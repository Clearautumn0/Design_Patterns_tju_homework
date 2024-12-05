package Pattern.DecoratorPattern;

public class FooterDecorator extends ReportDec{
    public FooterDecorator(Report report) {
        super(report);
    }

    @Override
    public void generateReport() {

        super.generateReport();
        System.out.println("-------Footer-------");
    }

}
