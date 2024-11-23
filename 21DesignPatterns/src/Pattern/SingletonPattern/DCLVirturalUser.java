/*
 * 双重检查锁单例模式
 * 可以提高资源利用率以及性能
 * 确保线程安全
 * 
 * 主要思想：
 * 1. 私有构造函数，确保外部无法直接创建对象
 * 2. 声明一个volatile static变量，保证线程安全
 * 3. 第一次检查是否已经有实例存在，如果有则直接返回，否则进入第二次检查
 * 4. 第二次检查时，使用volatile关键字，保证线程可见性，然后再次检查是否有实例存在，如果有则直接返回，否则创建实例并返回
 * 5. 由于volatile关键字的存在，保证了线程可见性，保证了线程安全
 * 
 * 保证了在使用时才创建实例,提高了资源利用率,降低了系统开销
 * 
 * 
 * @author 覃邱维
 */


package Pattern.SingletonPattern;

public class DCLVirturalUser {
    private static volatile DCLVirturalUser instance = null;

    private DCLVirturalUser() {
        System.out.println("创建了一个DCLSingleton实例");
    }

    public static DCLVirturalUser getInstance() {
        if (instance == null) {//第一次检查
            synchronized (DCLVirturalUser.class) {
                if (instance == null) {//第二次检查
                    instance = new DCLVirturalUser();
                }
            }
        }
        return instance;
    }

}
