package 创建型模式.builder.buildhouse建造者模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-02 10:11
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基，100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙，20厘米");
    }

    @Override
    public void roofed() {
        System.out.println("高楼盖透明屋顶");
    }
}
