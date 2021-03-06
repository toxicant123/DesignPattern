package 结构型模式.proxy.静态代理.应用实例;

/**
 * <p>
 * 代理对象，静态代理
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-05 14:45
 */
public class TeacherDaoProxy implements ITeacherDao {
    //目标对象，通过接口来聚合
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理...");
        target.teach();
        System.out.println("代理结束...");
    }
}
