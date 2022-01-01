package 创建型模式.factory.simplefactory.pizzastore简单工厂模式.order;

/**
 * <p>
 * 相当于一个客户端，发出订购
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-01 9:42
 */
public class PizzaStore {
    public static void main(String[] args) {
        //使用简单工厂模式
//        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
        OrderPizza2 orderPizza2 = new OrderPizza2();

    }

}
