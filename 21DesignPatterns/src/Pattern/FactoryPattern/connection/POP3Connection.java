package Pattern.FactoryPattern.connection;

import Pattern.FactoryPattern.framework.Product;

public class POP3Connection extends Product {
    private String from;
    private String to;

    public POP3Connection(String from, String to) {
        this.from = from;
        this.to = to;

    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    @Override
    public void connect() {
        System.out.println("POP3 connection Connection created between " + from + " and " + to + " with type POP3");
    }

}
