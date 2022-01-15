package 行为型模式.strategy.鸭子问题策略模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-15 14:25
 */
public class NoSwimBehavior implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("不会游泳");
    }
}
