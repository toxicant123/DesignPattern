package 创建型模式.factory.factorymethod.pizzastore工厂方法模式.order;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-01 12:47
 */
public class PizzaStore {
    public static void main(String[] args) {
        //创建北京口味的各种Pizza
        BJOrderPizza bjOrderPizza = new BJOrderPizza();
        LDOrderPizza ldOrderPizza = new LDOrderPizza();
    }
}
