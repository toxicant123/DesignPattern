package singleresponsibility;

/**
 * 方式1<br>
 * 运行结果：<br>
 * 摩托车 在公路上运行...<br>
 * 汽车 在公路上运行...<br>
 * 飞机 在公路上运行...<br>
 * <br>
 * 很显然这样是不对的，因为飞机不能在公路上运行<br>
 * <p>在方式1中的run方法中，违反了单一职责原则，解决的方案很简单，根据交通工具运行方法不同，分解成不同类即可</p>
 *
 * @author toxicant123
 * @Description
 * @create 2021-12-26 10:45
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }

}

//交通工具类
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行...");
    }
}
