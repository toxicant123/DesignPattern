package 结构型模式.flyweight.网站展现享元模式;

/**
 * <p>
 * 在此案例中为外部信息
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-05 10:04
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
