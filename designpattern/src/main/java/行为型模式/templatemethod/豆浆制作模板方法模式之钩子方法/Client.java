package 行为型模式.templatemethod.豆浆制作模板方法模式之钩子方法;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-05 23:01
 */
public class Client {
    public static void main(String[] args) {
        //制作红豆豆浆
        System.out.println("制作红豆豆浆");
        RedBeanSoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("制作花生豆浆");
        PeanutSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

        System.out.println("制作纯豆浆");
        PureSoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
