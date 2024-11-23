package Pattern.FactoryPattern.framework;

public abstract class Factory {
    public final Product create() {
        System.out.println("Creating product...");
        Product product = createProduct();
        return product;
    }

    protected abstract Product createProduct();

    public abstract void setType(String type);

}
