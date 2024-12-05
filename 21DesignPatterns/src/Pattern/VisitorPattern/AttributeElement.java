package Pattern.VisitorPattern;

public class AttributeElement implements Element {
    private String attributeName;

    public AttributeElement(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getAttributeName() {
        return attributeName;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
