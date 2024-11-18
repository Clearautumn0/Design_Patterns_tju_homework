package Pattern.IteratorPattern;

import java.util.List;

public class PageIterator<T> implements Iterator {
    private DataStore dataStore;
    private Integer index;
    private Integer pageSize;



    public PageIterator(DataStore dateStore, Integer PageSize) {
        this.dataStore = dateStore;
        this.index = 0;
        this.pageSize = PageSize;
    }


    @Override
    public boolean hasNext() {
        return (index * pageSize) < dataStore.getLength();
    }

    @Override
    public List<T> nextPage() {
        int start = index * pageSize;
        int end = Math.min(start + pageSize, dataStore.getLength());
        index++;
        return dataStore.getDateList().subList(start, end);
    }



}
