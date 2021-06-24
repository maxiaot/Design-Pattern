package cn.maxiaot.factory.simplefactory.calculator;

/**
 * 加法运算
 */
public class AddCalculate implements  Calculate {

    @Override
    public Integer calculate(Integer n, Integer m) {
        return n + m;
    }
}