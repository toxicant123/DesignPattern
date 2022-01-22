package 行为型模式.mediator.智能家庭管理中介者模式;

/**
 * <p>
 * 同事抽象类
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 12:01
 */
public abstract class Colleague {
    public String name;
    private Mediator mediator;

    public Colleague(Mediator mediator, String name) {

        this.mediator = mediator;
        this.name = name;

    }

    public Mediator GetMediator() {
        return this.mediator;
    }

    public abstract void SendMessage(int stateChange);
}
