package 结构型模式.decorator.星巴克咖啡订单装饰者模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-03 17:34
 */
public class LongBlack extends Coffee {
    public LongBlack() {
        setDes("long black coffee");
        setPrice(5.0d);
    }
}
