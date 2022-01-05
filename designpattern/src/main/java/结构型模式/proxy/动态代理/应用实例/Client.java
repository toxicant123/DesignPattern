package 结构型模式.proxy.动态代理.应用实例;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-05 15:48
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao target = new TeacherDao();

        //给目标对象，创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        System.out.println("proxyInstance=" + proxyInstance);

        //proxyInstance=class com.sun.proxy.$Proxy0内存中动态生成了代理对象
        System.out.println("proxyInstance=" + proxyInstance.getClass());

        //通过代理对象，调用目标对象的方法
        proxyInstance.teach();

        proxyInstance.sayHello("tom");
    }
}
