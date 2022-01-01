package 创建型模式.singleton.懒汉式.type7;

/**
 * <p>
 * 懒汉式（静态内部类）<br>
 * 静态内部类在装载时是线程安全的
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2021-12-30 10:38
 */
public class SingletonType7 {
    public static void main(String[] args) {
        //测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    ;

    //写一个静态内部类，该类中有一个静态属性Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}