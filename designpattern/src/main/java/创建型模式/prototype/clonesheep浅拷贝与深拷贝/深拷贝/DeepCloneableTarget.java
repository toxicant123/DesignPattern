package 创建型模式.prototype.clonesheep浅拷贝与深拷贝.深拷贝;

import java.io.Serializable;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-01 22:38
 */
public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 16347965841245L;

    private String cloneName;

    private String cloneClass;

    //构造器
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
