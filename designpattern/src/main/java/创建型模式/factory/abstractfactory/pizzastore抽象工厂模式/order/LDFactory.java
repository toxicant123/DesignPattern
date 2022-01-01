package 创建型模式.factory.abstractfactory.pizzastore抽象工厂模式.order;

import 创建型模式.factory.abstractfactory.pizzastore抽象工厂模式.pizza.LDCheesePizza;
import 创建型模式.factory.abstractfactory.pizzastore抽象工厂模式.pizza.LDPepperPizza;
import 创建型模式.factory.abstractfactory.pizzastore抽象工厂模式.pizza.Pizza;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-01 13:38
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
