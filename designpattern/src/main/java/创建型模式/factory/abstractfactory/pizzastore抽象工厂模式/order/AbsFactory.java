package 创建型模式.factory.abstractfactory.pizzastore抽象工厂模式.order;

import 创建型模式.factory.abstractfactory.pizzastore抽象工厂模式.pizza.Pizza;

/**
 * <p>
 * 抽象工厂模式的抽象层（接口）
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-01 13:34
 */
public interface AbsFactory {
    //让下面的工厂子类来具体实现
    Pizza createPizza(String orderType);
}
