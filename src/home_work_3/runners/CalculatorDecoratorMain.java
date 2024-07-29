package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {

    public static void main(String[] args) {

        CalculatorWithCounterAutoDecorator calc1 = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        double act1 = calc1.multiplication(15 ,7);

        double act2 = calc1.addition(4.1, act1);

        double act3 = calc1.division(28, 5);

        double act4 = calc1.factorization(act3, 2);

        double res = calc1.addition(act2, act4);

        System.out.println(res);

        System.out.println(calc1);




    }
}
