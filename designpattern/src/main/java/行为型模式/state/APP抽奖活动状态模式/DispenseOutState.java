package 行为型模式.state.APP抽奖活动状态模式;

/**
 * <p>
 * 奖品发放完毕状态<br>
 * 说明，当我们activity 改变成 DispenseOutState， 抽奖活动结束
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 22:13
 */
public class DispenseOutState extends State {

    /**
     * 初始化时传入活动引用
     */
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次再参加");
    }
}
