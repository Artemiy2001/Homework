package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {

    public static void main(String[] args) {

        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();

        double res = calc.addition(calc.addition(4.1, calc.multiplication(15 ,7)),
                calc.factorization(calc.division(28, 5), 2));

        System.out.println(res);
    }
}
