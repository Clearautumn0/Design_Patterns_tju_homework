package Pattern.FactoryPattern.connection;

import Pattern.FactoryPattern.framework.Product;

public class IMAPConnection extends Product{
    private String from;
    private String to;
 
    public IMAPConnection(String from, String to  ) {
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
        System.out.println("IMAP connection established from " + from + " to " + to + " with type IMAP");
    }
}
