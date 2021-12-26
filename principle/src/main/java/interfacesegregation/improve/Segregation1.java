package interfacesegregation.improve;

/**
 * <p>
 *     虽然A类不需要B类的4，5方法，但是B类仍然会实现，这违反了接口隔离原则
 * </p>
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2021-12-26 17:42
 */
public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());

    }
}

interface Interface1{
    void operation1();
}

interface interface2{
    void operation2();
    void operation3();
}

interface interface3{
    void operation4();
    void operation5();
}

class B implements Interface1,interface2{
    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3");
    }
}

class D implements Interface1,interface3{
    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}

//A类通过接口Interface1依赖（使用）B类，但是只会用到1，2，3方法
class A {
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(interface2 i){
        i.operation2();
    }
    public void depend3(interface2 i){
        i.operation3();
    }
}

//C类通过接口Interface1依赖（使用）D类，但是只会用到1，2，3方法
class C {
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(interface3 i){
        i.operation4();
    }
    public void depend5(interface3 i){
        i.operation5();
    }
}

