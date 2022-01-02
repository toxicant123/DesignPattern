package 创建型模式.builder.buildhouse建造者模式;

/**
 * <p>
 * 指挥者
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-02 10:13
 */
public class HouseDirector {
    private HouseBuilder houseBuilder = null;

    //构造器传入
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过setter传入
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        if (houseBuilder != null) {
            houseBuilder.buildBasic();
            houseBuilder.buildWalls();
            houseBuilder.roofed();
            return houseBuilder.buildHouse();
        } else {
            return null;
        }
    }
}
