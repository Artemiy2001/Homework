package home_work_2.loops;

import java.util.Scanner;

public class CounterEvenOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

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
}
