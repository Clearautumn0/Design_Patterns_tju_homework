package Pattern.SingletonPattern;

public class EagerVirtualUser {
    private static final EagerVirtualUser instance = new EagerVirtualUser();

    private EagerVirtualUser() {
        System.out.println("生成了一个饿汉单例对象");
    }

    public static EagerVirtualUser getInstance() {
        return instance;
    }
}
