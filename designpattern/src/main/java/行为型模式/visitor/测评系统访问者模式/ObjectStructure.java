package 行为型模式.visitor.测评系统访问者模式;

import java.util.LinkedList;
import java.util.List;

/**
 * <p>
 * 数据结构，管理很多人（Man，Woman）
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-07 21:20
 */
public class ObjectStructure {
    /**
     * 维护了一个集合
     */
    private List<Person> persons = new LinkedList<>();

    /**
     * 增加到list
     *
     * @param person
     */
    public void attach(Person person) {
        persons.add(person);
    }

    /**
     * 移除
     *
     * @param person
     */
    public void detach(Person person) {
        persons.remove(person);
    }

    /**
     * 显示测评情况
     *
     * @param action
     */
    public void display(Action action) {
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
