package 创建型模式.singleton.饿汉式.type1;

/**
 * <p>
 * 静态常量饿汉式
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2021-12-30 10:22
 */
public class SingletonType1 {
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
    //1.本类内部创建对象实例
    private final static Singleton INSTANCE = new Singleton();

    //2.构造器私有化，外部不能new
    private Singleton() {

    }

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
