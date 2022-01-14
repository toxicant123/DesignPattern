package 行为型模式.memento;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 13:39
 */
public class Originator {
    /**
     * 状态信息
     */
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 编写一个方法，可以保存一个状态对象Memento，因此编写一个方法，返回Memento
     *
     * @return
     */
    public Memento saveStateMemento() {
        return new Memento(state);
    }

    /**
     * 通过备忘录对象，恢复状态
     */
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
