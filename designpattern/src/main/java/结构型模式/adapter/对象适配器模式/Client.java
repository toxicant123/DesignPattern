package 结构型模式.adapter.对象适配器模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-03 9:52
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("类适配器模式");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
