package 结构型模式.facade.影院管理外观模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-04 22:31
 */
public class Projector {
    private static Projector instance = new Projector();

    private Projector() {
    }

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("projector on");
    }

    public void off() {
        System.out.println("projector off");
    }

    public void focus() {
        System.out.println("projector focus");
    }
}
