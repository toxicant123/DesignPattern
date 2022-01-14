package 行为型模式.mediator.智能家庭管理中介者模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 12:07
 */
public class Curtains extends Colleague {

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.GetMediator().GetMessage(stateChange, this.name);
    }

    public void UpCurtains() {
        System.out.println("I am holding Up Curtains!");
    }

}
