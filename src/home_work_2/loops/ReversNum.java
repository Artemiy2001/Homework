package home_work_2.loops;

import java.util.Scanner;

public class ReversNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        while (num > 0){

            System.out.print(num % 10);
            num /= 10;
        }
    }
}
