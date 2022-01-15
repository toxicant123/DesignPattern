package 行为型模式.strategy.鸭子问题策略模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-15 13:19
 */
public class WildDuck extends Duck {
    /**
     * 构造器
     */
    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
        swimBehavior = new GoodSwimBehavior();
        quackBehavior = new CanQuackBehavior();
    }

    /**
     * 显示鸭子信息
     */
    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
