package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    public double division(double x, double y){

        return x / y;
    }

    public double multiplication(double x, double y){

        return x * y;
    }

    public double subtraction(double x, double y){

        return x - y;
    }

    public double addition(double x, double y){

        return x + y;
    }


    public double factorization(double x, int y){

        return Math.pow(x, y);
    }

    public double modulus(double x){

        return Math.abs(x);
    }

    public double sqrt(double x){

        return Math.sqrt(x);
    }
}
