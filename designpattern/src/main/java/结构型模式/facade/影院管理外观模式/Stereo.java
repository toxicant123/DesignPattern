package 结构型模式.facade.影院管理外观模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-04 22:35
 */
public class Stereo {
    private static Stereo instance = new Stereo();

    private Stereo() {
    }

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("stereo on");
    }

    public void off() {
        System.out.println("stereo off");
    }

    public void up() {
        System.out.println("stereo's voice up");
    }

    public void down() {
        System.out.println("stereo's voice down");
    }
}
