package 创建型模式.factory.simplefactory.pizzastore简单工厂模式.pizza;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-01 9:32
 */
public class CheesePizza extends Pizza {
    public CheesePizza(){
        setName("cheese pizza");
    }

    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨准备原材料");
    }
}
