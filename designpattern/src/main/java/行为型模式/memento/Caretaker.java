package 行为型模式.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 13:48
 */
public class Caretaker {
    /**
     * 在List集合中会有很多的备忘录对象
     */
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    /**
     * 获取到第index个Originator的备忘录对象（即保存状态）
     *
     * @param index
     * @return
     */
    public Memento get(int index) {
        return mementoList.get(index);
    }
}
