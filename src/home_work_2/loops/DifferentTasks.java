package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class DifferentTasks {

    public static void main(String[] args) {

        System.out.println("Задача 1:");
        maxNum();
        System.out.println();

        System.out.println("Задача 2:");
        evenRandomNum();
        System.out.println();

        System.out.println("Задача 3:");
        evenOddDigits();
        System.out.println();

        System.out.println("Задача 4:");
        fibonacciSequence();
        System.out.println();

        System.out.println("Задача 5:");
        rangeNum();
        System.out.println();

        System.out.println("Задача 6:");
        reversNum();


    }

    private static void reversNum() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число которое нужно перевернуть: ");
        int num = scanner.nextInt();

        if (num < 0){
            num *= -1;
        }

        while (num > 0){

            System.out.print(num % 10);
            num /= 10;
        }
        System.out.println();
    }

    private static void rangeNum() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите минимально число: ");
        int minNum = scanner.nextInt();

        System.out.print("Введите максималоьно число: ");
        int maxNum = scanner.nextInt();

        System.out.print("Введите шаг: ");
        int range = scanner.nextInt();

        for (int i = minNum; i < maxNum;){
            System.out.print(i + " ");
            i += range;
        }
        System.out.println();
    }

    private static void fibonacciSequence() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во чисел фибоначи: ");

        int num = scanner.nextInt();


        for (int i = 1, j = 1, k = 2; i <= num; i++) {

            String separator;

            if (i == num) {
                separator = "";
            } else {
                separator = ", ";
            }

            if (i == 1) {
                System.out.print(j + separator);
            } else if (i == 2) {
                System.out.print(k + separator);
            } else {
                int x = j + k;
                System.out.print(x + separator);
                j = k;
                k = x;
            }
        }
        System.out.println();
    }

    private static void evenOddDigits() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для уточнения кол-ва четных и нечетных цифр: ");

        int num = scanner.nextInt();

        int counterEven = 0;
        int counterOdd = 0;

        while (num > 0){
            if (num % 2 == 0){
                counterEven++;
            }else {
                counterOdd++;
            }
            num /= 10;
        }

        System.out.println("Кол-во четных цифр: " + counterEven);
        System.out.println("Кол-во нечетных цифр: " + counterOdd);
    }

    private static void evenRandomNum() {

        Random rnd = new Random();

        int counterEven = 0;
        int counterOdd = 0;

        for (int i = 0; i < 1000; i++){
            if (rnd.nextInt(100) % 2 == 0){
                counterEven++;
            }else {
                counterOdd++;
            }
        }
        System.out.println("Из 1000 рандомных чисел:");
        System.out.println("Выпало четных чисел: " + counterEven);
        System.out.println("Выпало нечетных чисел: " + counterOdd);
    }

    private static void maxNum() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для уточнения максимальной цифры: ");

        int num = scanner.nextInt();

        int maxNum = 0;
        while (num > 0){
            if (num % 10 > maxNum){
                maxNum = num % 10;
            }
            num /= 10;
        }
        System.out.println("Максимальная цифра числа: " + maxNum);

    }
}