package 创建型模式.singleton.懒汉式.type6;

/**
 * <p>
 *     懒汉式（双重检查）
 * </p>
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2021-12-30 10:38
 */
public class SingletonType6 {
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
    private static volatile Singleton instance;

    private Singleton(){};

    //提供一个静态的公有方法，加入同步处理的代码，解决线程安全的问题
    //即懒汉式
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}