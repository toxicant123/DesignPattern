package dependenceinversion.improve;

/**
 * <p>
 * 方式二<br>
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
        person.receive(new WeiXin());
    }
}

//定义一个接口
interface IReceiver {
    String getInfo();
}

//完成Person接收消息的功能
class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}

class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "电子邮件信息：hello,world!";
    }
}

class WeiXin implements IReceiver {
    @Override
    public String getInfo() {
        return "微信信息：hello!";
    }
}

