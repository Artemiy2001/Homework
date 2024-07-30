package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {

    public static void main(String[] args) {

        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        double act1 = calc.multiplication(15 ,7);

        double act2 = calc.addition(4.1, act1);

        double act3 = calc.division(28, 5);

        double act4 = calc.factorization(act3, 2);

        double res = calc.addition(act2, act4);

        System.out.println(res);


        if (calc instanceof CalculatorWithCounterAutoDecorator){

            CalculatorWithCounterAutoDecorator calc2 = (CalculatorWithCounterAutoDecorator) calc;
            System.out.println(calc2.getCountOperation());

            ICalculator calc3 = ((CalculatorWithCounterAutoDecorator) calc).getInnerCalc();
            if (calc3 instanceof CalculatorWithMemoryDecorator){
                ((CalculatorWithMemoryDecorator) calc3).save();
                System.out.println(((CalculatorWithMemoryDecorator) calc3).load());
            }

        }

        




    }
}
