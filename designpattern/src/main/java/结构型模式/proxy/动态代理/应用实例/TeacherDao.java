package 结构型模式.proxy.动态代理.应用实例;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-05 15:28
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中...");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
