package 行为型模式.strategy.鸭子问题策略模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-15 14:07
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.swim();
        wildDuck.quack();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();
        pekingDuck.swim();
        pekingDuck.quack();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();
        toyDuck.swim();
        toyDuck.quack();

        //动态地改变某个对象的行为
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        pekingDuck.fly();
    }
}
