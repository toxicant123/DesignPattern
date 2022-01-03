package 结构型模式.composite.学校院系展示组合模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-03 23:07
 */
public abstract class OrganizationComponent {
    private String name; //名字
    private String des;

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    protected void add(OrganizationComponent organizationComponent) {
        //默认实现
    }

    protected void remove(OrganizationComponent organizationComponent) {
        //默认实现
    }

    //方法print，做成抽象的，所有子类都要实现
    protected abstract void print();

}
