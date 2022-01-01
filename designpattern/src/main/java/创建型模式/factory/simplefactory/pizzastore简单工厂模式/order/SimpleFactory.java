package 创建型模式.factory.simplefactory.pizzastore简单工厂模式.order;

import 创建型模式.factory.simplefactory.pizzastore简单工厂模式.pizza.*;

/**
 * <p>
 * 简单工厂类
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-01 10:17
 */
public class SimpleFactory {
    //简单工厂模式，也叫静态工厂模式
    public static Pizza createPizza2(String orderType) {
        System.out.println("使用简单工厂模式");

        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        } else if (orderType.equals("china")) {
            pizza = new ChinaPizza();
            pizza.setName("中国披萨");
        }

        return pizza;
    }

    public Pizza createPizza(String orderType) {
        System.out.println("使用简单工厂模式");

        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        } else if (orderType.equals("china")) {
            pizza = new ChinaPizza();
            pizza.setName("中国披萨");
        }

        return pizza;
    }

}
