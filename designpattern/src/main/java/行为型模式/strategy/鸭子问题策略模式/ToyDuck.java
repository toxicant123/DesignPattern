package 行为型模式.strategy.鸭子问题策略模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-15 13:21
 */
public class ToyDuck extends Duck {
    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
        quackBehavior = new CanNotQuackBehavior();
        swimBehavior = new NoSwimBehavior();
    }

    /**
     * 显示鸭子信息
     */
    @Override
    public void display() {
        System.out.println("这是玩具鸭");
    }
}
