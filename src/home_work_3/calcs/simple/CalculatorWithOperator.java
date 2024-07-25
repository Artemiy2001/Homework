package home_work_3.calcs.simple;

public class CalculatorWithOperator {

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
            double res = x;
            for (int i = 1; i < y;i++){
                res = res * x;
            }
        return res;
    }

    public double modulus(double x){
        if (x >= 0){
            return x;
        }else {
            return x * -1;
        }
    }

    public double sqrt(double x){

        return Math.sqrt(x);
    }
}
