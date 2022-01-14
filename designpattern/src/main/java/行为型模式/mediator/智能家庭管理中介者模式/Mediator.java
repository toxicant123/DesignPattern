package 行为型模式.mediator.智能家庭管理中介者模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 12:00
 */
public abstract class Mediator {
    /**
     * 将给中介者对象，加入到集合中
     *
     * @param colleagueName
     * @param colleague
     */
    public abstract void Register(String colleagueName, Colleague colleague);

    /**
     * 接收消息, 具体的同事对象发出
     *
     * @param stateChange
     * @param colleagueName
     */
    public abstract void GetMessage(int stateChange, String colleagueName);

    public abstract void SendMessage();
}
