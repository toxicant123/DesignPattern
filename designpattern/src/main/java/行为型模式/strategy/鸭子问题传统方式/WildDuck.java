package 行为型模式.strategy.鸭子问题传统方式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-15 13:19
 */
public class WildDuck extends Duck {
    /**
     * 显示鸭子信息
     */
    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
