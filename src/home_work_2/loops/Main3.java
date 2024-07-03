package home_work_2.loops;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для возведения в степень: ");

        float num1 = scanner.nextFloat();

        System.out.print("Введите степень числа: ");

        int num2 = scanner.nextInt();

        double result = pow(num1, num2);

        System.out.println(num1 + " ^ " + num2 + " = " + result);
    }

    private static double pow(double num1, int num2){
        double result = 1;
        for (int i = 0; i < num2; i++){
            result *= num1;
        }
        return result;
    }
}
