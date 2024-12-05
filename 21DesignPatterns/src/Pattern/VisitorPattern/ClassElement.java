package Pattern.VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class ClassElement implements Element {
    private String className;
    private List<AttributeElement> attributes = new ArrayList<>();
    private List<MethodElement> methods = new ArrayList<>();

    public ClassElement(String className) {
        this.className = className;
    }

    public void addAttribute(AttributeElement attribute) {
        attributes.add(attribute);
    }

    public void addMethod(MethodElement method) {
        methods.add(method);
    }

    public String getClassName() {
        return className;
    }

    public List<AttributeElement> getAttributes() {
        return attributes;
    }

    public List<MethodElement> getMethods() {
        return methods;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (AttributeElement attribute : attributes) {
            attribute.accept(visitor);
        }
        for (MethodElement method : methods) {
            method.accept(visitor);
        }
    }

    public int getLineCount() {
        int count = 2;
        for (MethodElement method : methods) {
            count += method.getLineCount();
        }

        count += attributes.size();
        return count;
    }

}
