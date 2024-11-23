package Pattern.FactoryPattern.connection;

import Pattern.FactoryPattern.framework.Product;

public class HTTPConnection extends Product {
    private String from;
    private String to;

    public HTTPConnection(String from, String to) {
        this.from = from;
        this.to = to;

    }

    @Override
    public void connect() {
        System.out.println("Http connection Connecting from " + from + " to " + to + " with HTTP protocol ");
    }
}
