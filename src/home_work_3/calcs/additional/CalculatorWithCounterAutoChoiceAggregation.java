package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAggregation {

    private CalculatorWithMathCopy innerCalc1;
    private CalculatorWithMathExtends innerCalc2;
    private CalculatorWithOperator innerCalc3;

    private long counterOperation = 0;

    public long getCountOperation(){
        return counterOperation;
    }

    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithMathCopy innerCalc1) {
        this.innerCalc1 = innerCalc1;
    }

    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithMathExtends innerCalc2) {
        this.innerCalc2 = innerCalc2;
    }

    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithOperator innerCalc3) {
        this.innerCalc3 = innerCalc3;
    }

    public CalculatorWithMathCopy getInnerCalc1() {
        counterOperation++;
        return innerCalc1;
    }

    public CalculatorWithMathExtends getInnerCalc2() {
        counterOperation++;
        return innerCalc2;
    }

    public CalculatorWithOperator getInnerCalc3() {
        counterOperation++;
        return innerCalc3;
    }
}
