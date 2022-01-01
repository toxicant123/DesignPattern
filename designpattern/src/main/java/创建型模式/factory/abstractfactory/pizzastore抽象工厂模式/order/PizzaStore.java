package 创建型模式.factory.abstractfactory.pizzastore抽象工厂模式.order;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-01 13:47
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new BJFactory());
    }
}
