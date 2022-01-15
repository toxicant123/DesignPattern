package 行为型模式.state.APP抽奖活动状态模式;

/**
 * <p>
 * 状态抽象类
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 22:07
 */
public abstract class State {


    /**
     * 扣除积分 - 50
     */
    public abstract void deductMoney();

    /**
     * 是否抽中奖品
     *
     * @return
     */
    public abstract boolean raffle();

    /**
     * 发放奖品
     */
    public abstract void dispensePrize();

}
