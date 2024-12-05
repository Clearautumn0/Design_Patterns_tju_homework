package Pattern.VisitorPattern;

public class IdentifierExtractionVisitor implements Visitor {

    @Override
    public void visit(ClassElement classElement) {
        System.out.println("Class Name: " + classElement.getClassName());
    }

    @Override
    public void visit(AttributeElement attributeElement) {
        System.out.println("Attribute Name: " + attributeElement.getAttributeName());
    }

    @Override
    public void visit(MethodElement methodElement) {
        System.out.println("Method Name: " + methodElement.getMethodName());
    }
}
