package Pattern.VisitorPattern;

public class LineCountVisitor implements Visitor {

    private int totalLines = 0;

    @Override
    public void visit(ClassElement classElement) {
        System.out.println("Class: " + classElement.getClassName());
    }

    @Override
    public void visit(AttributeElement attributeElement) {
        // 不统计属性的代码行数
    }

    @Override
    public void visit(MethodElement methodElement) {
        totalLines += methodElement.getLineCount();
        System.out.println(
                "Method: " + methodElement.getMethodName() + " has " + methodElement.getLineCount() + " lines.");
    }

    public int getTotalLines() {
        return totalLines;
    }

}
