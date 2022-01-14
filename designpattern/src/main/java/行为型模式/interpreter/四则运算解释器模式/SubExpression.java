package 行为型模式.interpreter.四则运算解释器模式;

import java.util.HashMap;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 17:31
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    //求出left 和 right 表达式相减后的结果
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
