package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private int counterUsage = 0;

    public void incrementCountOperation(){
        counterUsage++;
    }

    public long getCountOperation(){
        return counterUsage;
    }
}
