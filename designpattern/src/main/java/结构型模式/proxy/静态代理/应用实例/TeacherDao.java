package 结构型模式.proxy.静态代理.应用实例;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-05 14:44
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中...");
    }
}
