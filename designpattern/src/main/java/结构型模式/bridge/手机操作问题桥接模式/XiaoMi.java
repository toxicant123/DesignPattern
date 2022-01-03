package 结构型模式.bridge.手机操作问题桥接模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-03 13:20
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
