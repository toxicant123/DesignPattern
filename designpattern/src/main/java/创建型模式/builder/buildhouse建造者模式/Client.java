package 创建型模式.builder.buildhouse建造者模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-02 10:18
 */
public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();
    }
}
