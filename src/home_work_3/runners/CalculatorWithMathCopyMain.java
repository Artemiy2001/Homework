package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {

    public static void main(String[] args) {

        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();

        double act1 = calc.multiplication(15 ,7);

        double act2 = calc.addition(4.1, act1);

        double act3 = calc.division(28, 5);

        double act4 = calc.factorization(act3, 2);

        double res = calc.addition(act2, act4);

        System.out.println(res);
    }
}
