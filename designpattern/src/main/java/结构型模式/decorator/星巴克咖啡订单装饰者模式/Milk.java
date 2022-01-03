package 结构型模式.decorator.星巴克咖啡订单装饰者模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-03 21:20
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2d);
    }
}
