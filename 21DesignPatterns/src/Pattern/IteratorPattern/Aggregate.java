package Pattern.IteratorPattern;

public interface Aggregate {
    public Iterator  createIterator(Integer pageSize);
}
