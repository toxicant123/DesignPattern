package 行为型模式.memento.游戏角色状态恢复备忘录模式;

/**
 * <p>
 * 守护者对象，保存游戏角色的状态
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 14:43
 */
public class Caretaker {
    /**
     * 如果只保存一次状态
     */
    private Memento memento;

    /**
     * 对GameRole保存多次状态
     */
//    private ArrayList<Memento> mementos;

    /**
     * 对多个游戏角色保存多个状态
     */
//    private HashMap<String, ArrayList<Memento>> rolesMementos;
    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
