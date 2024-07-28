package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAggregationInterface {

    private final ICalculator innerCalc;

    private long countOperation = 0;

    public CalculatorWithCounterAutoAggregationInterface(ICalculator innerCalc) {
        this.innerCalc = innerCalc;
    }

    public ICalculator getInnerCalc() {
        countOperation++;
        return innerCalc;
    }


    public long getCountOperation() {
        return countOperation;
    }
}
