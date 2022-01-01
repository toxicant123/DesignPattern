package singleresponsibility;

/**
 * <p>
 * 方式三:<br>
 * 这种修改方法并没有对原来的类做大修改，只是增加了方法
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2021-12-26 11:19
 * @project DesignPattern
 */
public class SingleResponsibillity3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runWater("轮船");
        vehicle2.runAir("飞机");
    }
}

class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行...");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " 在天空上运行...");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + " 在水中运行...");
    }
}
