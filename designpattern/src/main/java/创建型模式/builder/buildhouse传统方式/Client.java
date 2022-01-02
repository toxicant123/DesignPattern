package 创建型模式.builder.buildhouse传统方式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-02 9:01
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
        HighBuilding highBuilding = new HighBuilding();
        highBuilding.build();
    }
}
