/*
 * 
 * 使用静态内部类来持有实例的方式
 * 巧妙的应用了java中类的加载机制来保证线程安全和懒加载,
 * 只有当第一次调用getInstance()方法时,
 * 才会加载内部类Holder,从而创建单例对象
 * 这样做的好处是在实例正需要时加载内部类来创建单例对象
 * 从类图来看,外部类的设计与其他方法并无区别,
 * 但是外部类持有一个Holder内部类,内部类持有实例,
 * 这样做的好处是在需要单例时,提供内部类持有的实例
 * 
 * 
 */

package Pattern.SingletonPattern;

public class IoDHVirtualUser {
    private static IoDHVirtualUser instance = null;

    private IoDHVirtualUser() {
        System.out.println("创建了一个IoDHSingleton实例");

    }

    private static class Holder {

        private static final IoDHVirtualUser instance = new IoDHVirtualUser();
    }

    public static IoDHVirtualUser getInstance() {
        return Holder.instance;
    }

}
