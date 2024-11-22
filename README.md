<h1 id="YoL7W"> 实验目的  </h1>
1.  结合实例，熟练绘制设计模式结构图。 
2. 结合实例，熟练使用Java语言实现设计模式。 
3. 通过本实验，理解每一种设计模式的模式动机，掌握模式结构，学习如何使用代码实现 这些设计模式

<h1 id="WZY14"> 实验要求  </h1>
1.  结合实例，绘制设计模式的结构图。
2.  使用Java语言实现设计模式实例，代码运行正确。

<h1 id="eZLe1"> 实验内容  </h1>
<h2 id="qxEcY"> 迭代器模式  </h2>
     设计一个逐页迭代器，每次可返回指定个数（一页）元素，并将该迭代器用于对数据进 行分页处理。绘制对应的类图并编程模拟实现。

<h2 id="tFH4y"> 适配器模式  </h2>
 某 OA 系统需要提供一个加密模块，将用户机密信息（例如口令、邮箱等）加密之后 再存储在数据库中，系统已经定义好了数据库操作类。为了提高开发效率，现需要重用已有 的加密算法，这些算法封装在一些由第三方提供的类中，有些甚至没有源代码。试使用适配 器模式设计该加密模块，实现在不修改现有类的基础上重用第三方加密方法。要求绘制相应 的类图并编程模拟实现，需要提供对象适配器和类适配器两套实现方案。

<h1 id="VrXBE">实验结果</h1>
<h2 id="W5QQF">迭代器模式</h2>
<h3 id="la8q2">类图</h3>
![画板](https://cdn.nlark.com/yuque/0/2024/jpeg/42875579/1731925448969-8d556184-e434-4f6d-bcbb-161e7fa1f9ab.jpeg)

<h3 id="BBHxy">代码实现</h3>
```java
public interface Aggregate {
    public Iterator  createIterator(Integer pageSize);
}
```

```java
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
```

```java
public interface Iterator<T> {
    public abstract boolean hasNext();
    public abstract  List<T>  nextPage();
}
```

```java
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
```

```java
package Demo;

import java.util.ArrayList;
import java.util.List;

import Pattern.DataStore;
import Pattern.Iterator;
import Pattern.PageIterator;

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
```

<h3 id="oSZzK">测试结果</h3>
实现了通过迭代器进行分页信息查看的功能

![](https://cdn.nlark.com/yuque/0/2024/png/42875579/1731925613952-74118bbc-0dac-49c9-a2ac-834dce57eaee.png)

<h2 id="QbiPI">适配器模式</h2>
<h3 id="DB4yx">类图</h3>
![画板](https://cdn.nlark.com/yuque/0/2024/jpeg/42875579/1731928041592-0ac82d78-5ebd-43dc-a29f-95be29e46eca.jpeg)

<h3 id="A8SwI">代码实现</h3>
```java
public class Database {
    public void save(String encryptedData) {
        System.out.println("Data:" + encryptedData+"保存到数据库!"+"时间:"+System.currentTimeMillis());
    }
}
```

```java
public class ThirdPartyEncryptor {
    public  String externalEncrypt(String data) {
        System.out.println("三方加密器加密中...");
        return new StringBuilder(data).reverse().toString();
    }

}
```

```java
public interface EncryptionTarget {
    String encrypt(String data);
}
```

```java
public class EncryptionAdapterObject implements EncryptionTarget {
    private ThirdPartyEncryptor encryptor;

    public EncryptionAdapterObject(ThirdPartyEncryptor encryptor) {
        this.encryptor = encryptor;
    }

    @Override
    public String encrypt(String data) {
        // TODO Auto-generated method stub
        try {
            System.out.println("对象加密器加密中...    ");
            return encryptor.externalEncrypt(data);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("加密结束");
        }
        return null;

        // throw new UnsupportedOperationException("Unimplemented method 'encrypt'");
    }
}
```

```java
public class EncryptionAdapterClass extends ThirdPartyEncryptor implements EncryptionTarget {

    @Override
    public String encrypt(String data) {
        // TODO Auto-generated method stub
        System.out.println("类加密器加密中...");
        return super.externalEncrypt(data);
        // throw new UnsupportedOperationException("Unimplemented method 'encrypt'");
    }

}
```

```java
public class AdapterDemo {
    public static void main(String[] args) {
     // 第三方加密实例
        ThirdPartyEncryptor thirdPartyEncryptor = new ThirdPartyEncryptor();

        // 使用对象适配器
        EncryptionTarget objectAdapter = new EncryptionAdapterObject(thirdPartyEncryptor);
        String objectEncryptedData = objectAdapter.encrypt("password123");
        System.out.println("对象适配器加密: " + objectEncryptedData);

        // 使用类适配器
        EncryptionTarget classAdapter = new EncryptionAdapterClass();
        String classEncryptedData = classAdapter.encrypt("password123");
        System.out.println("类加密器加密: " + classEncryptedData);

        // 模拟存储到数据库
        Database db = new Database();
        db.save(objectEncryptedData);
        db.save(classEncryptedData);
    }
```

<h3 id="phXyJ">测试结果</h3>
![](https://cdn.nlark.com/yuque/0/2024/png/42875579/1731928176210-40aa7d1e-a381-4f32-a6fb-8888fc47a414.png)

<h1 id="EkZE5"> 实验小结  </h1>
<h3 id="Xe5cF">实验的收获</h3>
本次实验中,加深了我对迭代器模式与适配器模式的设计方法的理解,认识到了设计模式的重要性

理解了迭代器模式用于分离数据集合的遍历逻辑与集合结构本身。通过逐页迭代器的实现，掌握了如何实现复杂的数据分页处理。  

 学到了如何设计灵活的迭代器接口，使得集合类可以无缝扩展为支持不同的遍历方式（如逐页遍历）。  

在适配器模式的练习中,我学会了如何在不修改第三方代码的情况下将其功能适配到现有的系统中

在这个过程中学会了如何通过接口设计,使类的实现多样化

同时通过对类图的构建熟悉了如何通过类图清晰的表达类之间的关系与各自的职责,为代码实现提供设计指导

<h3 id="S9pm6">实验中遇到的问题</h3>
 一开始不清楚在什么情况下选择对象适配器，什么情况下选择类适配器。通过分析两种适配器的优缺点，明确对象适配器适合需要动态组合多个类，类适配器适合需要继承单个类的场景得以解决.

<h3 id="No5Ia"> 有待改进之处</h3>
     目前适配器模式的模拟代码中对于第三方类可能出现的异常处理不够全面，例如第三方加密方法可能抛出的异常没有进行捕获,而且目前的适配器仅支持单一的加密算法。如果未来需要支持多个第三方加密类，则对象适配器需要额外改动。

     本次实验让我深刻体会到设计模式在实际开发中的重要性，尤其是在面对复杂系统需求时，合理使用模式能够有效降低开发成本并提升代码质量。迭代器模式与适配器模式的组合使用，不仅解决了实际问题，也让我对设计模式有了更深的理解  
