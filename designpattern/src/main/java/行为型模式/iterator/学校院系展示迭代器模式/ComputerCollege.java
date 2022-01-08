package 行为型模式.iterator.学校院系展示迭代器模式;

import java.util.Iterator;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-08 10:01
 */
public class ComputerCollege implements College{

    private Department[] departments;

    /**
     * 保存当前数组的对象个数
     */
    private int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("java专业","java专业");
        addDepartment("PHP专业","PHP专业");
        addDepartment("大数据专业","大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    /**
     * 增加系的方法
     *
     * @param name
     * @param desc
     */
    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment++;
    }

    /**
     * 返回一个迭代器，遍历
     *
     * @return
     */
    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
