package 创建型模式.factory.simplefactory.pizzastore传统方式.pizza;

/**
 * <p>
 * 将Pizza类做成抽象类
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-01 9:29
 */
public abstract class Pizza {
    protected String name;

    //准备原材料，不同的披萨不一样，因此我们做成抽象方法
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
