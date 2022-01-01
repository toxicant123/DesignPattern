package 创建型模式.factory.factorymethod.pizzastore工厂方法模式.order;

import 创建型模式.factory.factorymethod.pizzastore工厂方法模式.pizza.BJCheesePizza;
import 创建型模式.factory.factorymethod.pizzastore工厂方法模式.pizza.BJPepperPizza;
import 创建型模式.factory.factorymethod.pizzastore工厂方法模式.pizza.Pizza;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-01 12:42
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
