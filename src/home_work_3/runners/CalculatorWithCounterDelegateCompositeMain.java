package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {

    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();

        double act1 = calc.getInnerCalc().multiplication(15 ,7);

        double act2 = calc.getInnerCalc().addition(4.1, act1);

        double act3 = calc.getInnerCalc().division(28, 5);

        double act4 = calc.getInnerCalc().factorization(act3, 2);

        double res = calc.getInnerCalc().addition(act2, act4);

        System.out.println(res);
        System.out.println("Использований калькулятора: " + calc.getCountOperation());
    }
}
