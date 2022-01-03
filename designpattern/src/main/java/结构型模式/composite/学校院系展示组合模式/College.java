package 结构型模式.composite.学校院系展示组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-03 23:17
 */
public class College extends OrganizationComponent {
    //List 中 存放的Department
    private List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    // 构造器
    public College(String name, String des) {
        super(name, des);
        // TODO Auto-generated constructor stub
    }

    // 重写add
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        // TODO Auto-generated method stub
        //  将来实际业务中，Colleage 的 add 和  University add 不一定完全一样
        organizationComponents.add(organizationComponent);
    }

    // 重写remove
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        // TODO Auto-generated method stub
        organizationComponents.remove(organizationComponent);
    }

    // print方法，就是输出University 包含的学院
    @Override
    protected void print() {
        // TODO Auto-generated method stub
        System.out.println("--------------" + getName() + "--------------");
        //遍历 organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
