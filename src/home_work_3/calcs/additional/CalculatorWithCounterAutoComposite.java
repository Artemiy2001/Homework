package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {

    private final CalculatorWithMathCopy innerCalc = new CalculatorWithMathCopy();

    private long counterOperation = 0;

    public long getCountOperation(){
        return counterOperation;
    }


    public CalculatorWithMathCopy getInnerCalc() {
        counterOperation++;
        return innerCalc;
    }

}
