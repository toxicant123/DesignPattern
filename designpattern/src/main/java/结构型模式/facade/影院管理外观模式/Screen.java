package 结构型模式.facade.影院管理外观模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-04 22:34
 */
public class Screen {
    private static Screen instance = new Screen();

    private Screen() {
    }

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("screen up");
    }

    public void down() {
        System.out.println("screen down");
    }
}
