package 结构型模式.adapter.接口适配器模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-03 10:38
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            //只需要去覆盖我们需要使用的接口方法
            @Override
            public void m1() {

            }
        };
    }
}
