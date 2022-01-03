package 结构型模式.bridge.手机操作问题桥接模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-03 13:24
 */
public class FoldedPhone extends Phone {
    //构造器
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("折叠样式手机打开");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠样式手机关闭");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠样式手机打电话");
    }
}
