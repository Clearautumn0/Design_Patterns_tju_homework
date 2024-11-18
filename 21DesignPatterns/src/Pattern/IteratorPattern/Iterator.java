package Pattern.IteratorPattern;

import java.util.List;

public interface Iterator<T> {
    public abstract boolean hasNext();
    public abstract  List<T>  nextPage();
}
