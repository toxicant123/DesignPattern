package 行为型模式.mediator.智能家庭管理中介者模式;

/**
 * <p>
 * 具体的同事类
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 12:06
 */
public class Alarm extends Colleague {

    /**
     * 构造器
     *
     * @param mediator
     * @param name
     */
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //在创建Alarm 同事对象时，将自己放入到ConcreteMediator 对象中[集合]
        mediator.Register(name, this);
    }

    public void SendAlarm(int stateChange) {
        SendMessage(stateChange);
    }

    @Override
    public void SendMessage(int stateChange) {
        //调用的中介者对象的getMessage
        this.GetMediator().GetMessage(stateChange, this.name);
    }

}
