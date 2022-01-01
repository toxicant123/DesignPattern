package 创建型模式.prototype.clonesheep浅拷贝与深拷贝.浅拷贝;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-01 19:32
 */
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    private String address;
    public Sheep friend;

    public Sheep() {
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Sheep(String name, int age, String color, String address) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    //克隆该实例，使用默认的clone方法来完成
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
