package 结构型模式.flyweight.网站展现享元模式;

import java.util.HashMap;

/**
 * <p>
 * 网站工厂类，根据需要返回一个网站
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-05 9:50
 */
public class WebSiteFactory {
    //集合，充当池的作用
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    //根据网站的类型，返回一个网站，如果没有就创建一个网站，并放入到池子中，并返回
    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }

        return (WebSite) pool.get(type);
    }

    //获取网站分类的总数（池中有多少个网站的类型）
    public int getWebSiteCount() {
        return pool.size();
    }
}
