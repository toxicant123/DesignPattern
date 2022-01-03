package 结构型模式.adapter.对象适配器模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-03 9:50
 */
public class Phone {
    //充电
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V，可以开始充电");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5V，不能充电");
        }

    }
}
