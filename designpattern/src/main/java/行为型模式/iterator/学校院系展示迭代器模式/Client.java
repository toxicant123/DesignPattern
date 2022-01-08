package 行为型模式.iterator.学校院系展示迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-08 10:19
 */
public class Client {
    public static void main(String[] args) {
        //创建学院
        List<College> collegeList = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutPutImpl outPut = new OutPutImpl(collegeList);
        outPut.printCollege();
    }
}
