package 行为型模式.visitor.测评系统访问者模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-07 21:05
 */
public abstract class Action {
    /**
     * 得到男性的测评结果
     *
     * @param man
     */
    public abstract void getManResult(Man man);

    /**
     * 得到女性的测评
     *
     * @param woman
     */
    public abstract void getWomanResult(Woman woman);
}
