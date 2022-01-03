package 结构型模式.decorator.星巴克咖啡订单装饰者模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-03 17:36
 */
public class Decaf extends Coffee {
    public Decaf() {
        setDes("无咖啡因咖啡");
        setPrice(3.5d);
    }
}
