package 结构型模式.adapter.对象适配器模式;

/**
 * <p>
 * 适配器类
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-03 9:47
 */
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    //通过构造器，传入一个Voltage220V的实例
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (voltage220V != null) {
            //获取220V电压
            int src = voltage220V.output220V();
            System.out.println("使用对象适配器，进行适配");
            dst = src / 44;
            System.out.println("适配完成");
        }

        return dst;
    }

    public void setVoltage220V(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }
}
