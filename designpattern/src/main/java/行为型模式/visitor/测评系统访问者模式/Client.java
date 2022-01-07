package 行为型模式.visitor.测评系统访问者模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-07 21:35
 */
public class Client {
    public static void main(String[] args) {
        //创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        //成功
        Success success = new Success();
        objectStructure.display(success);
        System.out.println("---------------------------");
        Fail fail = new Fail();
        objectStructure.display(fail);

        System.out.println("------------给的是待定的结果--------------");
        Wait wait = new Wait();
        objectStructure.display(wait);
    }
}
