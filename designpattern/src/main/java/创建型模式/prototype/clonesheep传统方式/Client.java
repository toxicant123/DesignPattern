package 创建型模式.prototype.clonesheep传统方式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-01 19:33
 */
public class Client {
    public static void main(String[] args) {
        //传统的方法
        Sheep sheep1 = new Sheep("tom", 1, "白色");
        Sheep sheep2 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep3 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep4 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep5 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());

        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
    }
}
