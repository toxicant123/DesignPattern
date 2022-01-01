package 创建型模式.factory.abstractfactory.pizzastore抽象工厂模式.order;

import 创建型模式.factory.abstractfactory.pizzastore抽象工厂模式.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-01 13:39
 */
public class OrderPizza {
    AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        setAbsFactory(factory);
    }

    private void setAbsFactory(AbsFactory factory) {
        Pizza pizza;
        String orderType; //用户输入的
        this.factory = factory;

        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
