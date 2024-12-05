package Pattern.VisitorPattern;

public interface Visitor {
    void visit(ClassElement element);

    void visit(AttributeElement element);

    void visit(MethodElement element);

}
