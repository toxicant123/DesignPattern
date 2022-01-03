package 结构型模式.adapter.类适配器模式;

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
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        //获取到220V的电压
        int src = output220V();
        int dstV = src / 44;
        return dstV;
    }

}
