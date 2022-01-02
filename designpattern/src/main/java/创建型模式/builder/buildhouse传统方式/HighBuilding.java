package 创建型模式.builder.buildhouse传统方式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-02 8:59
 */
public class HighBuilding extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("给高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("给高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("给高楼封顶");
    }
}
