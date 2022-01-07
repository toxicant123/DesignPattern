package 行为型模式.visitor.测评系统访问者模式;

/**
 * <p>
 * 说明：<br>
 * 1.这里我们使用到了双分派，即首先在客户端程序中，将具体状态作为参数传递到Man中（第一次分派）<br>
 * 2.然后Man类调用了作为参数的“具体方法”中方法getManResult，同时将自己（this）作为参数传入，
 * 完成第二次分派
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-07 21:08
 */
public class Man extends Person {
    /**
     * 提供一个方法，让访问者可以访问
     *
     * @param action
     */
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
