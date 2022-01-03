package 结构型模式.decorator.星巴克咖啡订单装饰者模式;

/**
 * <p>
 * 具体的Decorator，这里就是调味品
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-03 21:19
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3d); //调味品的价格
    }
}
