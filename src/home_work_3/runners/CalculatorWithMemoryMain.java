package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {

    public static void main(String[] args) {

        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());

        double act1 = calc.multiplication(15 ,7);
        calc.save();

        double act2 = calc.addition(4.1, calc.load());

        double act3 = calc.division(28, 5);
        calc.save();

        double act4 = calc.factorization(calc.load(), 2);
        calc.save();

        double res = calc.addition(act2, calc.load());

        System.out.println(res);
    }
}
