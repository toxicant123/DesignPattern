package 结构型模式.facade.影院管理外观模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-04 22:50
 */
public class TheaterLight {
    private static TheaterLight instance = new TheaterLight();

    private TheaterLight() {
    }

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("theaterlight on");
    }

    public void off() {
        System.out.println("theaterlight off");
    }

    public void dim() {
        System.out.println("theaterlight dim");
    }

    public void bright() {
        System.out.println("theaterlight bright");
    }
}
