package 创建型模式.builder.buildhouse建造者模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-02 10:10
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基，5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙，10厘米");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子盖屋顶");
    }
}
