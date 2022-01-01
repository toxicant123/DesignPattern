package 创建型模式.factory.simplefactory.pizzastore简单工厂模式.order;

import 创建型模式.factory.simplefactory.pizzastore简单工厂模式.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-01 9:34
 */
public class OrderPizza2 {
    //定义一个简单工厂对象
    Pizza pizza = null;
    String orderType = "";

    public OrderPizza2(){
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);

            //输出pizza
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }
        } while (true);
    }

    //写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
