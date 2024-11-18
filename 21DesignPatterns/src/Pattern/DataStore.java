package Pattern;

import java.lang.classfile.constantpool.PackageEntry;
import java.util.List;

public class DataStore<T> implements Aggregate {
    private List<T> data;


    public DataStore(List<T> data) {
        this.data = data;

    }



    public List<T> getDateList() {
        // TODO Auto-generated method stub
        return this.data;
    }
    public Integer getLength() {
        return this.data.size();
    }



    @Override
    public Iterator createIterator(Integer pageSize) {
        // TODO Auto-generated method stub
        return  (Iterator) new PageIterator(this, pageSize);
    }

}
