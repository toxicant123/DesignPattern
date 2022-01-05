package 结构型模式.proxy.Cglib代理.应用实例;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-05 17:07
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao target = new TeacherDao();
        //获取到代理对象，并且将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
        //执行代理对象的方法，除法intecept方法，从而实现对目标对象的调用
        proxyInstance.teach();
    }
}
