package 行为型模式.visitor.测评系统访问者模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-07 21:08
 */
public class Success extends Action {
    /**
     * 得到男性的测评结果
     *
     * @param man
     */
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价：该歌手很成功");
    }

    /**
     * 得到女性的测评
     *
     * @param woman
     */
    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价：该歌手很成功");
    }
}
