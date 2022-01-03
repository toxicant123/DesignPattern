package 结构型模式.adapter.对象适配器模式;

/**
 * <p>
 * 被适配的类
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-03 9:46
 */
public class Voltage220V {
    //输出220V的电压
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "V");
        return src;
    }
}
