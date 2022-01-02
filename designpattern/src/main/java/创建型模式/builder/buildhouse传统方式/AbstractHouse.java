package 创建型模式.builder.buildhouse传统方式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-02 8:56
 */
public abstract class AbstractHouse {
    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();

    //真正的建造方法，一次调用上面三个方法
    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
