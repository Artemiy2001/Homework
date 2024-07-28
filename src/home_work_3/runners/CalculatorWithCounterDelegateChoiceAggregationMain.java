package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAggregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAggregationMain {

    public static void main(String[] args) {

        CalculatorWithCounterAutoChoiceAggregation calc1 = new CalculatorWithCounterAutoChoiceAggregation(new CalculatorWithMathCopy());

        CalculatorWithCounterAutoChoiceAggregation calc2 = new CalculatorWithCounterAutoChoiceAggregation(new CalculatorWithMathExtends());

        CalculatorWithCounterAutoChoiceAggregation calc3 = new CalculatorWithCounterAutoChoiceAggregation(new CalculatorWithOperator());

        double act1 = calc1.getInnerCalc1().multiplication(15 ,7);

        double act2 = calc1.getInnerCalc1().addition(4.1, act1);

        double act3 = calc1.getInnerCalc1().division(28, 5);

        double act4 = calc1.getInnerCalc1().factorization(act3, 2);

        double res = calc1.getInnerCalc1().addition(act2, act4);

        System.out.println(res);
        System.out.println("Использований калькулятора: " + calc1.getCountOperation());

        act1 = calc2.getInnerCalc2().multiplication(15 ,7);

        act2 = calc2.getInnerCalc2().addition(4.1, act1);

        act3 = calc2.getInnerCalc2().division(28, 5);

        act4 = calc2.getInnerCalc2().factorization(act3, 2);

        res = calc2.getInnerCalc2().addition(act2, act4);

        System.out.println(res);
        System.out.println("Использований калькулятора: " + calc2.getCountOperation());

        act1 = calc3.getInnerCalc3().multiplication(15 ,7);

        act2 = calc3.getInnerCalc3().addition(4.1, act1);

        act3 = calc3.getInnerCalc3().division(28, 5);

        act4 = calc3.getInnerCalc3().factorization(act3, 2);

        res = calc3.getInnerCalc3().addition(act2, act4);

        System.out.println(res);
        System.out.println("Использований калькулятора: " + calc3.getCountOperation());

    }
}
