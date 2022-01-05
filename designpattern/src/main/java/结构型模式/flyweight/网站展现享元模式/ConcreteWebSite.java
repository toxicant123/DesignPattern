package 结构型模式.flyweight.网站展现享元模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-05 9:48
 */
public class ConcreteWebSite extends WebSite {
    //网站发布的类型
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为：" + type + " 在使用中。。。使用者是" + user.getName());
    }
}
