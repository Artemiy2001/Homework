package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {

    private final ICalculator innerCalc;

    private long counterOperation = 0;

    public long getCountOperation(){
        return counterOperation;
    }


    public CalculatorWithCounterAutoDecorator(ICalculator innerCalc) {
        this.innerCalc = innerCalc;
    }

    @Override
    public double division(double x, double y) {
        counterOperation++;
        return innerCalc.division(x, y);
    }

    @Override
    public double multiplication(double x, double y) {
        counterOperation++;
        return innerCalc.multiplication(x, y);
    }

    @Override
    public double subtraction(double x, double y) {
        counterOperation++;
        return innerCalc.subtraction(x, y);
    }

    @Override
    public double addition(double x, double y) {
        counterOperation++;
        return innerCalc.addition(x, y);
    }

    @Override
    public double factorization(double x, int y) {
        counterOperation++;
        return innerCalc.factorization(x, y);
    }

    @Override
    public double modulus(double x) {
        counterOperation++;
        return innerCalc.modulus(x);
    }

    @Override
    public double sqrt(double x) {
        counterOperation++;
        return innerCalc.sqrt(x);
    }

    public ICalculator getInnerCalc() {
        return innerCalc;
    }
}
