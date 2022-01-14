package 行为型模式.interpreter.四则运算解释器模式;

import java.util.HashMap;

/**
 * <p>
 * 变量的解释器
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 17:32
 */
public class VarExpression extends Expression {

    private String key; // key=a,key=b,key=c

    public VarExpression(String key) {
        this.key = key;
    }

    // var 就是{a=10, b=20}
    // interpreter 根据 变量名称，返回对应值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
