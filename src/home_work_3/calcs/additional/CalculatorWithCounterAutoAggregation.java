package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAggregation {

    private final CalculatorWithMathCopy innerCalc;

    public CalculatorWithCounterAutoAggregation(CalculatorWithMathCopy innerCalc) {
        this.innerCalc = innerCalc;
    }

    private long counterOperation = 0;

    public long getCountOperation(){
        return counterOperation;
    }


    public CalculatorWithMathCopy getInnerCalc() {
        counterOperation++;
        return innerCalc;
    }
}
