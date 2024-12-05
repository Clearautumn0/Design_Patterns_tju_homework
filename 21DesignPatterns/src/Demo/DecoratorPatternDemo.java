package Demo;

import Pattern.DecoratorPattern.ConcReport;
import Pattern.DecoratorPattern.FooterDecorator;
import Pattern.DecoratorPattern.HeaderDecorator;
import Pattern.DecoratorPattern.Report;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Report report = new ConcReport();

        report = new HeaderDecorator(report); // 为报表添加表头
        report = new FooterDecorator(report); // 为报表添加表尾

        report.generateReport();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        report = new HeaderDecorator(report); // 为报表添加表头
        report = new FooterDecorator(report); // 为报表添加表尾
        report.generateReport();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        // 创建一个新的报表，先添加表尾，再添加表头
        Report anotherReport = new ConcReport();
        anotherReport = new FooterDecorator(anotherReport); // 为报表添加表尾
        anotherReport = new HeaderDecorator(anotherReport); // 为报表添加表头

        // 生成新的报表
        anotherReport.generateReport();

    }
}
