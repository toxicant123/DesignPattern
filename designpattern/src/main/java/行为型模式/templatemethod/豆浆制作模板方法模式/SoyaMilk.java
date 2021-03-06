package 行为型模式.templatemethod.豆浆制作模板方法模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-05 22:50
 */
public abstract class SoyaMilk {
    //模板方法，make，模板方法可以做成final，不让子类去重写
    public final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    //选材料
    private void select() {
        System.out.println("第一步：选择好的新鲜黄豆");
    }

    //添加不同的配料，抽象方法，子类具体实现
    protected abstract void addCondiments();

    //浸泡
    private void soak() {
        System.out.println("第三步：黄豆和配料开始浸泡，需要三小时");
    }

    //打豆浆
    private void beat() {
        System.out.println("第四步：黄豆和配料放到豆浆机去打碎");
    }
}
