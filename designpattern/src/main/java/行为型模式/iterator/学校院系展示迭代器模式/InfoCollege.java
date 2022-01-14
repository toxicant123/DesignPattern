package 行为型模式.iterator.学校院系展示迭代器模式;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-08 10:06
 */
public class InfoCollege implements College {
    private List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<>();
        addDepartment("信息安全专业", "信息安全专业");
        addDepartment("网络安全专业", "网络安全专业");
        addDepartment("服务器安全专业", "服务器安全专业");
    }

    @Override
    public String getName() {
        return "信息工程学院";
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
        departmentList.add(department);
    }

    /**
     * 返回一个迭代器，遍历
     *
     * @return
     */
    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
