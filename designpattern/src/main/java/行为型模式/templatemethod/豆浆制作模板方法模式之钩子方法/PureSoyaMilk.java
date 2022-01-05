package 行为型模式.templatemethod.豆浆制作模板方法模式之钩子方法;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-05 23:09
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    protected void addCondiments() {
        //空实现
    }

    @Override
    protected boolean customerWantCondiments() {
        return false;
    }
}
