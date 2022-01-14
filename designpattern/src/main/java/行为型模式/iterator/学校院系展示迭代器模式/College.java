package 行为型模式.iterator.学校院系展示迭代器模式;

import java.util.Iterator;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-08 9:34
 */
public interface College {
    String getName();

    /**
     * 增加系的方法
     *
     * @param name
     * @param desc
     */
    void addDepartment(String name, String desc);

    /**
     * 返回一个迭代器，遍历
     *
     * @return
     */
    Iterator createIterator();
}
