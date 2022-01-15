package 行为型模式.strategy.鸭子问题传统方式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-15 13:21
 */
public class ToyDuck extends Duck {
    /**
     * 显示鸭子信息
     */
    @Override
    public void display() {
        System.out.println("这是玩具鸭");
    }

    //需要重写父类的所有方法


    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭不会飞翔");
    }
}
