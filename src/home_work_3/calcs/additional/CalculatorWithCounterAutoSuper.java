package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long counterOperation = 0;

    public long getCountOperation(){
        return counterOperation;
    }

    @Override
    public double division(double x, double y) {
        counterOperation++;
        return super.division(x, y);
    }

    @Override
    public double multiplication(double x, double y) {
        counterOperation++;
        return super.multiplication(x, y);
    }

    @Override
    public double subtraction(double x, double y) {
        counterOperation++;
        return super.subtraction(x, y);
    }

    @Override
    public double addition(double x, double y) {
        counterOperation++;
        return super.addition(x, y);
    }

    @Override
    public double factorization(double x, int y) {
        counterOperation++;
        return super.factorization(x, y);
    }

    @Override
    public double modulus(double x) {
        counterOperation++;
        return super.modulus(x);
    }

    @Override
    public double sqrt(double x) {
        counterOperation++;
        return super.sqrt(x);
    }
}
