package 结构型模式.decorator.星巴克咖啡订单装饰者模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-03 17:37
 */
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public double cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        //obj.getDes()  输出被装饰者的信息
        return super.des + " " + super.getPrice() + "&&" + obj.getDes();
    }
}
