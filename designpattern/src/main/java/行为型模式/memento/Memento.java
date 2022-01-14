package 行为型模式.memento;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 13:42
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
