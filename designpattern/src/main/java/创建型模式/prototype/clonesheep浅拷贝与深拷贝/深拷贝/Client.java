package 创建型模式.prototype.clonesheep浅拷贝与深拷贝.深拷贝;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-01 22:47
 */
public class Client {
    public static void main(String[] args) throws Exception {
        DeepProtoType deepProtoType1 = new DeepProtoType();
        deepProtoType1.name = "宋江";
        deepProtoType1.deepCloneableTarget = new DeepCloneableTarget("大牛", "大牛类");

        //方式1 完成深拷贝
//        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType1.clone();
//        System.out.println(deepProtoType1.deepCloneableTarget.hashCode());
//        System.out.println(deepProtoType2.deepCloneableTarget.hashCode());

        //方式2 完成深拷贝
        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType1.deepClone();
        System.out.println(deepProtoType1.deepCloneableTarget.hashCode());
        System.out.println(deepProtoType2.deepCloneableTarget.hashCode());
    }
}
