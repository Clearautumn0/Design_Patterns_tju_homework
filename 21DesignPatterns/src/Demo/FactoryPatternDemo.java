package Demo;

import Pattern.FactoryPattern.connection.ConnecttionFactory;
import Pattern.FactoryPattern.framework.Factory;
import Pattern.FactoryPattern.framework.Product;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        String from = "China";
        String to = "USA";

        Factory factory = new ConnecttionFactory(from, to);
        factory.setType("POP3");
        Product product1 = factory.create();
        product1.connect();

        factory.setType("IMAP");
        Product product2 = factory.create();
        product2.connect();

        factory.setType("HTTP");
        Product product3 = factory.create();
        product3.connect();

    }

}
