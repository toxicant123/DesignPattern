package 行为型模式.visitor.测评系统访问者模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-07 21:08
 */
public abstract class Person {
    /**
     * 提供一个方法，让访问者可以访问
     *
     * @param action
     */
    public abstract void accept(Action action);
}
