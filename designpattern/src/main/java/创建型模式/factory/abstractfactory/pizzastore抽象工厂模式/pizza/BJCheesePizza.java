package 创建型模式.factory.abstractfactory.pizzastore抽象工厂模式.pizza;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-01 12:24
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("给北京奶酪披萨准备原材料");
    }
}
