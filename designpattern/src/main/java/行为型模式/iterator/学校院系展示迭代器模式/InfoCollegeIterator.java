package 行为型模式.iterator.学校院系展示迭代器模式;

import java.util.Iterator;
import java.util.List;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-08 9:25
 */
public class InfoCollegeIterator implements Iterator {
    /**
     * 信息工程学院是以List方式存放系信息的
     */
    private List<Department> departmentList;

    /**
     * 索引
     */
    private int index = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1){
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    /**
     * 空实现remove
     */
    @Override
    public void remove() {
    }
}
