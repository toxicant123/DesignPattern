package 结构型模式.composite.学校院系展示组合模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-03 23:19
 */
public class Department extends OrganizationComponent {
    //没有集合

    public Department(String name, String des) {
        super(name, des);
    }

    //add，remove方法就不用写了，因为是叶子节点

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
