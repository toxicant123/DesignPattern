package 行为型模式.strategy.鸭子问题传统方式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-15 13:20
 */
public class PekingDuck extends Duck {
    /**
     * 显示鸭子信息
     */
    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }

    //因为北京鸭不能飞翔，因此要重写fly

    @Override
    public void fly() {
        System.out.println("北京鸭不能飞翔");
    }
}
