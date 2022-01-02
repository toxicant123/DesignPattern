package 创建型模式.builder.buildhouse传统方式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-02 8:58
 */
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("给普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("给普通房子封顶");
    }
}
