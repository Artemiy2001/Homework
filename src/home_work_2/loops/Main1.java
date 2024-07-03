package home_work_2.loops;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        int num = scanner.nextInt();

        long result1 = getFactorial(num);
        long result2 = getFactorial2(num);
        if (result1 > 0){
            System.out.println("Фактортал через цикл: " + result1);
            System.out.println("Факториал через рекурсию: " + result2);
        }else {
            System.out.println("Число больше long!");
        }


        
    }

    public static long getFactorial(int num){
        long result = 1;
        for (int i = 1; i <= num; i++){
            result *= i;

        }
        return result;
    }
    private static long getFactorial2(int num) {
        long result = 1;
        if (num == 1){
            return 1;
        }
        result = num * getFactorial2(num - 1);
        return result;
    }
}

