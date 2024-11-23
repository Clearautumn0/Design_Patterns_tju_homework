package Pattern.FactoryPattern.connection;

import Pattern.FactoryPattern.framework.Factory;
import Pattern.FactoryPattern.framework.Product;

public class ConnecttionFactory extends Factory {
    private String from;
    private String to;
    private String type;

    public ConnecttionFactory(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Product createProduct() {

        return createConnection(this.type);

    }

    private Product createConnection(String type) {
        switch (type) {
            case "POP3":
                return new POP3Connection(this.from, this.to);
            case "IMAP":
                return new IMAPConnection(this.from, this.to);
            case "HTTP":
                return new HTTPConnection(this.from, this.to);
            default:
                return null;

        }

    }
}