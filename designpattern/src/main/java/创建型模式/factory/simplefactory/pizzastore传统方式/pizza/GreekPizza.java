package 创建型模式.factory.simplefactory.pizzastore传统方式.pizza;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-01 9:33
 */
public class GreekPizza extends Pizza {
    //    public GreekPizza(){
//        setName("greek pizza");
//    }
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
