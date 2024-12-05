package Pattern.VisitorPattern;

public class MethodElement implements Element {
    private String methodName;
    private int lineCount;

    public MethodElement(String methodName, int lineCount) {
        this.methodName = methodName;
        this.lineCount = lineCount;
    }
    public String getMethodName() {
        return methodName;
    }

    public int getLineCount() {
        return lineCount;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
