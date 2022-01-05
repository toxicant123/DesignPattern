package 结构型模式.proxy.静态代理.应用实例;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-05 14:52
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象（被代理对象）
        TeacherDao teacherDao = new TeacherDao();

        //创建代理对象，同时将被代理对象传递给代理对象
        TeacherDaoProxy proxy = new TeacherDaoProxy(teacherDao);

        //通过代理对象，调用到被代理对象的方法
        //即执行的是代理对象的方法，代理对象再去调用目标对象的方法
        proxy.teach();
    }
}
