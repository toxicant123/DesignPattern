package singleresponsibility;

/**
 * 方式2<br>
 * <p>方案2的分析<br>
 * 遵守了单一职责原则，但是这样做的改动很大，将类分解，同时修改客户端</p>
 *
 * <p>
 * 改进：<br>
 * 直接修改Vehicle类，改动的代码会比较少=>方案3
 * </p>
 *
 * @author toxicant123
 * @Description
 * @create 2021-12-26 10:45
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }

}

class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路运行");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在天空运行");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在水中运行");
    }
}
