package 结构型模式.facade.影院管理外观模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-04 22:26
 */
public class DVDPlayer {
    //单例模式
    private static DVDPlayer instance = new DVDPlayer();

    private DVDPlayer() {
    }

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("DVD on");
    }

    public void off() {
        System.out.println("DVD off");
    }

    public void play() {
        System.out.println("DVD is playing...");
    }

    public void pause() {
        System.out.println("DVD pause...");
    }
}
