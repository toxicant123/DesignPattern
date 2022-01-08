package 行为型模式.iterator.学校院系展示迭代器模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-08 9:17
 */
public class Department {
    private String name;
    private String desc;

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
