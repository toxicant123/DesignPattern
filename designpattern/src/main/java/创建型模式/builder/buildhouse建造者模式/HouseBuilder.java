package 创建型模式.builder.buildhouse建造者模式;

/**
 * <p>
 * 抽象的建造者
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-02 10:07
 */
public abstract class HouseBuilder {
    protected House house = new House();

    //将建造的流程写好，抽象的方法
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    //建造房子，房子建造好后，将房子返回
    public House buildHouse() {
        return house;
    }
}
