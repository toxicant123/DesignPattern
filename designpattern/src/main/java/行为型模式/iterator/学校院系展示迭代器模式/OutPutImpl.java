package 行为型模式.iterator.学校院系展示迭代器模式;

import java.util.Iterator;
import java.util.List;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-08 10:11
 */
public class OutPutImpl {
    /**
     * 学院集合
     */
    private List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    /**
     * 输出学院的系
     * @param iterator
     */
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }

    /**
     * 遍历所有学院，然后调用printDepartment输出各个学院的系
     */
    public void printCollege(){
        //从collegeList取出所有学院，java中的list已经实现了iterator接口
        Iterator<College> iterator = collegeList.iterator();

        while (iterator.hasNext()){
            //取出一个学院
            College college = iterator.next();
            System.out.println("============" + college.getName() + "=============");
            //得到对应的迭代器进行调用
            printDepartment(college.createIterator());
        }
    }
}
