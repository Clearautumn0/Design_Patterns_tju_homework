package Pattern.AdapterPattern;

/**
 * 数据库模拟类
 * @author 覃邱维
 * Created by lnq on 2017/6/1.
 */ 



public class Database {
    public void save(String encryptedData) {
        System.out.println("Data:" + encryptedData+"保存到数据库!"+"时间:"+System.currentTimeMillis());
    }
}
