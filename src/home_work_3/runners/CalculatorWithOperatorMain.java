package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {

    public static void main(String[] args) {

        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        CalculatorWithOperator calc = new CalculatorWithOperator();

        double res = calc.addition(calc.addition(4.1, calc.multiplication(15 ,7)),
                calc.factorization(calc.division(28, 5), 2));

        System.out.println(res);
    }
}
