package Demo;

import Pattern.VisitorPattern.AttributeElement;
import Pattern.VisitorPattern.IdentifierExtractionVisitor;
import Pattern.VisitorPattern.LineCountVisitor;
import Pattern.VisitorPattern.MethodElement;
import Pattern.VisitorPattern.MetricsVisitor;
import Pattern.VisitorPattern.ObjectStructure;
import Pattern.VisitorPattern.ClassElement;

public class VisitorPatternDemo {
     public static void main(String[] args) {
        // 创建类及其成员
        ClassElement class1 = new ClassElement("User");
        class1.addAttribute(new AttributeElement("name"));
        class1.addAttribute(new AttributeElement("age"));
        class1.addMethod(new MethodElement("getName", 5));
        class1.addMethod(new MethodElement("setName", 6));

        ClassElement class2 = new ClassElement("Product");
        class2.addAttribute(new AttributeElement("id"));
        class2.addAttribute(new AttributeElement("price"));
        class2.addMethod(new MethodElement("getPrice", 10));

        // 创建对象结构
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(class1);
        objectStructure.addElement(class2);

        // 使用 LineCountVisitor
        LineCountVisitor lineCountVisitor = new LineCountVisitor();
        objectStructure.accept(lineCountVisitor);
        System.out.println("Total lines: " + lineCountVisitor.getTotalLines());

        // 使用 IdentifierExtractionVisitor
        IdentifierExtractionVisitor identifierVisitor = new IdentifierExtractionVisitor();
        objectStructure.accept(identifierVisitor);

        // 使用 MetricsVisitor
        MetricsVisitor metricsVisitor = new MetricsVisitor();
        objectStructure.accept(metricsVisitor);
        metricsVisitor.printMetrics();
    }
}
