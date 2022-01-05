package 结构型模式.proxy.Cglib代理.应用实例;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-05 16:38
 */
public class TeacherDao {
    public void teach() {
        System.out.println("老师授课中... 我是cglib代理，不需要实现接口");
    }
}
