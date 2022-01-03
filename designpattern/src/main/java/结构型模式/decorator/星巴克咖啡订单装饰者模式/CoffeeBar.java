package 结构型模式.decorator.星巴克咖啡订单装饰者模式;

/**
 * <p>
 * 装饰者模式下的订单：2份巧克力+1份牛奶
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-03 21:22
 */
public class CoffeeBar {
    public static void main(String[] args) {
        //1.点一份LongBlack
        Drink order = new LongBlack();
        System.out.println(order.cost());

        //2.加入一份牛奶
        order = new Milk(order);
        System.out.println(order.cost());

        order = new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());
    }
}
