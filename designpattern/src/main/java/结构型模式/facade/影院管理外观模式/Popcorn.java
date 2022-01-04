package 结构型模式.facade.影院管理外观模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-04 22:29
 */
public class Popcorn {
    private static Popcorn instance = new Popcorn();

    private Popcorn() {
    }

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("popcorn on");
    }

    public void off() {
        System.out.println("popcorn off");
    }

    public void pop() {
        System.out.println("popcorn is poping");
    }
}
