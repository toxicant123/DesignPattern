package 行为型模式.interpreter.四则运算解释器模式;

import java.util.HashMap;

/**
 * <p>
 * 加法解释器
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 17:26
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    //处理相加
    //var 仍然是 {a=10,b=20}..
    //一会我们debug 源码,就ok
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        //super.left.interpreter(var) ： 返回 left 表达式对应的值 a = 10
        //super.right.interpreter(var): 返回right 表达式对应值 b = 20
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
