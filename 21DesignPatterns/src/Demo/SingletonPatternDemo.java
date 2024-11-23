package Demo;

import Pattern.SingletonPattern.DCLVirturalUser;
import Pattern.SingletonPattern.EagerVirtualUser;
import Pattern.SingletonPattern.IoDHVirtualUser;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        // 测试饿汉单例模式
        EagerVirtualUser user1 = EagerVirtualUser.getInstance();
        EagerVirtualUser user2 = EagerVirtualUser.getInstance();
        if (user1 == user2) {
            System.out.println("饿汉单例模式测试成功！");
        } else {
            System.out.println("饿汉单例模式测试失败！");
        }

        // 测试双重检查锁单例模式
        DCLVirturalUser user3 = DCLVirturalUser.getInstance();
        DCLVirturalUser user4 = DCLVirturalUser.getInstance();
        if (user3 == user4) {
            System.out.println("双重检查锁单例模式测试成功！");
        } else {
            System.out.println("双重检查锁单例模式测试失败！");
        }
        // 测试IoDH单例模式
        IoDHVirtualUser user5 = IoDHVirtualUser.getInstance();
        IoDHVirtualUser user6 = IoDHVirtualUser.getInstance();
        if (user5 == user6) {
            System.out.println("IoDH单例模式测试成功！");

        } else {
            System.out.println("IoDH单例模式测试失败！");
        }
    }
}
