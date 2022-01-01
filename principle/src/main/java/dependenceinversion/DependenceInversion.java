package dependenceinversion;

/**
 * <p>
 * 完成Person接收消息的功能<br>
 * 方式一<br>
 * 方式一较为简单，比较容易想到，但是如果我们获取的对象是微信，短信等等，我们需要新加类，同时Person也要增加相应的接受方法<br>
 * 解决思路：引入一个抽象接口IRceiver，表示接收者，这样Person类与接口发生依赖<br>
 * 因为Email，微信等等都属于接收的范围，他们各自实现IReceiver，接口就ok，这样我们就符合依赖倒转原则
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2021-12-26 18:27
 */
public class DependenceInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

//完成Person接收消息的功能
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }

    public void receive(Weixin weixin) {
        System.out.println(weixin.getInfo());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息：hello,world!";
    }
}

class Weixin {
    public String getInfo() {
        return "微信信息：hello";
    }
}

