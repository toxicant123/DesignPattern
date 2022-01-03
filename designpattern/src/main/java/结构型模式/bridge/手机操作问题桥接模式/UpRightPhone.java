package 结构型模式.bridge.手机操作问题桥接模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-03 13:43
 */
public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("直立样式手机打开");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("直立样式手机关闭");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直立样式手机打电话");
    }
}
