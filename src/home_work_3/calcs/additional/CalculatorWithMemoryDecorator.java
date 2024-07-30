package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {

    private final ICalculator innerCalc;

    private double memoryValue;
    private double saveValue;


    public CalculatorWithMemoryDecorator(ICalculator innerCalc) {
        this.innerCalc = innerCalc;
    }

    public void save(){
        saveValue = memoryValue;
    }

    public double load(){
        return saveValue;
    }

    @Override
    public double division(double x, double y) {
        memoryValue = innerCalc.division(x, y);
        return memoryValue;
    }

    @Override
    public double multiplication(double x, double y) {
        memoryValue = innerCalc.multiplication(x, y);
        return memoryValue;
    }

    @Override
    public double subtraction(double x, double y) {
        memoryValue = innerCalc.subtraction(x, y);
        return memoryValue;
    }

    @Override
    public double addition(double x, double y) {
        memoryValue = innerCalc.addition(x, y);
        return memoryValue;
    }

    @Override
    public double factorization(double x, int y) {
        memoryValue = innerCalc.factorization(x, y);
        return memoryValue;
    }

    @Override
    public double modulus(double x) {
        memoryValue = innerCalc.modulus(x);
        return memoryValue;
    }

    @Override
    public double sqrt(double x) {
        memoryValue = innerCalc.sqrt(x);
        return memoryValue;
    }

    public ICalculator getInnerCalc() {
        return innerCalc;
    }
}
