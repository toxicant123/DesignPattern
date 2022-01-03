package 结构型模式.decorator.星巴克咖啡订单装饰者模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-03 17:29
 */
public abstract class Drink {
    public String des; //描述
    private double price = 0.0d;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //计算费用的抽象方法
    public abstract double cost();
}
