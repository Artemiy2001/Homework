package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {

    private ICalculator innerCalc;

    private double memoryValue;
    private double saveValue;


    public CalculatorWithMemory(ICalculator innerCalc) {
        this.innerCalc = innerCalc;
    }


    public void save(){
        saveValue = memoryValue;
    }

    public double load(){
        return saveValue;
    }

    public double division(double x, double y){
        memoryValue = innerCalc.division(x, y);
        return memoryValue;
    }

    public double multiplication(double x, double y){
        memoryValue = innerCalc.multiplication(x, y);
        return memoryValue;
    }

    public double subtraction(double x, double y){
        memoryValue = innerCalc.subtraction(x, y);
        return memoryValue;
    }

    public double addition(double x, double y){
        memoryValue = innerCalc.addition(x, y);
        return memoryValue;
    }

    public double factorization(double x, int y){
        memoryValue = innerCalc.factorization(x, y);
        return memoryValue;
    }

    public double modulus(double x){
        memoryValue = innerCalc.modulus(x);
        return memoryValue;
    }

    public double sqrt(double x){
        memoryValue = innerCalc.sqrt(x);
        return memoryValue;
    }


}
