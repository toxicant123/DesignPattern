package 行为型模式.strategy.鸭子问题传统方式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-15 13:17
 */
public abstract class Duck {
    public Duck() {
    }

    public void quack() {
        System.out.println("鸭子嘎嘎叫~");
    }

    public void swim() {
        System.out.println("鸭子会游泳~");
    }

    public void fly() {
        System.out.println("鸭子会飞翔~");
    }

    /**
     * 显示鸭子信息
     */
    public abstract void display();
}
