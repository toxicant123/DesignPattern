package 行为型模式.templatemethod.豆浆制作模板方法模式之钩子方法;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-05 22:56
 */
public class PeanutSoyaMilk extends SoyaMilk {
    @Override
    protected void addCondiments() {
        System.out.println("加入上好的花生");
    }
}
