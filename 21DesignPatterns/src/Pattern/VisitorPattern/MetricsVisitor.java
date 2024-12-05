package Pattern.VisitorPattern;

public class MetricsVisitor implements Visitor {
    private int classCount = 0;
    private int attributeCount = 0;
    private int methodCount = 0;

    @Override
    public void visit(ClassElement classElement) {
        classCount++;
    }

    @Override
    public void visit(AttributeElement attributeElement) {
        attributeCount++;
    }

    @Override
    public void visit(MethodElement methodElement) {
        methodCount++;
    }

    public void printMetrics() {
        System.out.println("Classes: " + classCount);
        System.out.println("Attributes: " + attributeCount);
        System.out.println("Methods: " + methodCount);
    }
}
