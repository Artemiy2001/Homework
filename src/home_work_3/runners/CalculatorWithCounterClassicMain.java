package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {

    public static void main(String[] args) {

        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();


        double act1 = calc.multiplication(15 ,7);
        calc.incrementCountOperation();

        double act2 = calc.addition(4.1, act1);
        calc.incrementCountOperation();

        double act3 = calc.division(28, 5);
        calc.incrementCountOperation();

        double act4 = calc.factorization(act3, 2);
        calc.incrementCountOperation();

        double res = calc.addition(act2, act4);
        calc.incrementCountOperation();


        System.out.println(res);
        System.out.println("Использований калькулятора: " + calc.getCountOperation());
    }
}
