package home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator{

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
