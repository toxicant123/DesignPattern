package 行为型模式.interpreter.四则运算解释器模式;

import java.util.HashMap;

/**
 * <p>
 * 抽象类表达式，通过HashMap 键值对, 可以获取到变量的值
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 17:30
 */
public abstract class Expression {
    // a + b - c
    // 解释公式和数值, key 就是公式(表达式) 参数[a,b,c], value就是就是具体值
    // HashMap {a=10, b=20}
    public abstract int interpreter(HashMap<String, Integer> var);
}
