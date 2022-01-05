package 结构型模式.proxy.Cglib代理.应用实例;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-05 16:39
 */
public class ProxyFactory implements MethodInterceptor {
    //维护一个目标对象
    private Object target;

    //构造器，传入一个被代理的对象
    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 1.创建一个工具类
     * 2.设置父类
     * 3.设置回调函数
     * 4.创建子类对象，即代理对象
     *
     * @return 返回一个代理对象，是target对象的代理对象
     */
    public Object getProxyInstance() {
        //1.创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(target.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建子类对象，即代理对象
        return enhancer.create();
    }

    /**
     * 重写intercept方法，会调用目标对象的方法
     *
     * @param obj
     * @param method
     * @param args
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理模式开始...");
        Object returnValue = method.invoke(target, args);
        System.out.println("cglib代理模式提交...");
        return returnValue;
    }
}
