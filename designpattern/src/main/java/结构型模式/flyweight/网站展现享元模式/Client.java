package 结构型模式.flyweight.网站展现享元模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-05 9:56
 */
public class Client {
    public static void main(String[] args) {
        //创建一个工厂类
        WebSiteFactory factory = new WebSiteFactory();

        //客户要一个以新闻形式发布的网站
        WebSite webSite1 = factory.getWebSiteCategory("新闻");

        webSite1.use(new User("tom"));

        //客户要一个以博客形式发布的网站
        WebSite webSite2 = factory.getWebSiteCategory("博客");

        webSite2.use(new User("jack"));

        //客户要一个以微信小程序形式发布的网站
        WebSite webSite3 = factory.getWebSiteCategory("微信");

        webSite3.use(new User("jerry"));
    }
}
