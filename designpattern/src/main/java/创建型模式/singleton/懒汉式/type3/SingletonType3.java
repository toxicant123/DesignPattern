package 创建型模式.singleton.懒汉式.type3;

/**
 * <p>
 *     懒汉式（线程不安全）
 * </p>
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2021-12-30 10:38
 */
public class SingletonType3 {
    public static void main(String[] args) {
        //测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton(){};

    //提供一个静态的公有方法，当使用到该方法时，才去创建instance
    //即懒汉式
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}