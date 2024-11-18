package Demo;

import java.util.ArrayList;
import java.util.List;

import Pattern.IteratorPattern.DataStore;
import Pattern.IteratorPattern.Iterator;
import Pattern.IteratorPattern.PageIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            list.add(i);
        }
    
    
    DataStore ds = new DataStore(list);


    
    System.out.println("分页数据:");
    Iterator it= (Iterator)ds.createIterator( 5);
    while (it.hasNext()) {
        List<String> page = it.nextPage();
        System.out.println(page);
    
    }
    }


}
