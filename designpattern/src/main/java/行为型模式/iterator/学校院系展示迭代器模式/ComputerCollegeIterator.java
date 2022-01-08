package 行为型模式.iterator.学校院系展示迭代器模式;

import java.util.Iterator;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-08 9:17
 */
public class ComputerCollegeIterator implements Iterator {
    /**
     * 这里我们需要知道Department是以怎样的方式存放
     */
    private Department[] departments;

    /**
     * 遍历的位置
     */
    private int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    /**
     * 判断是否还有下一个元素
     * @return
     */
    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    /**
     * 删除的方法，默认空实现
     */
    @Override
    public void remove() {}
}
