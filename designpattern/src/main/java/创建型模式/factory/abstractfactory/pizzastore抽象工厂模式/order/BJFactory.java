package 创建型模式.factory.abstractfactory.pizzastore抽象工厂模式.order;

import 创建型模式.factory.abstractfactory.pizzastore抽象工厂模式.pizza.BJCheesePizza;
import 创建型模式.factory.abstractfactory.pizzastore抽象工厂模式.pizza.BJPepperPizza;
import 创建型模式.factory.abstractfactory.pizzastore抽象工厂模式.pizza.Pizza;

/**
 * <p>
 * 这是一个工厂子类
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-01 13:36
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
