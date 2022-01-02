package 创建型模式.builder.buildhouse建造者模式;

/**
 * <p>
 * 产品类
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-02 10:05
 */
public class House {
    private String basic;
    private String wall;
    private String roofed;

    public House() {
    }

    public House(String basic, String wall, String roofed) {
        this.basic = basic;
        this.wall = wall;
        this.roofed = roofed;
    }

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    @Override
    public String toString() {
        return "House{" +
                "basic='" + basic + '\'' +
                ", wall='" + wall + '\'' +
                ", roofed='" + roofed + '\'' +
                '}';
    }
}
