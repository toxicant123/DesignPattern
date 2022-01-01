package 创建型模式.factory.simplefactory.pizzastore简单工厂模式.pizza;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-01 9:51
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给胡椒披萨准备原材料");
    }
}
