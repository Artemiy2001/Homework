package home_work_2.loops;

import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        int num = scanner.nextInt();


        for (int i = 1, j = 1, k = 2; i <= num; i++){

            String separator;

            if (i == num){
                separator = "";
            }else {
                separator = ", ";
            }

            if (i == 1){
                System.out.print(j + separator);
            } else if (i == 2) {
                System.out.print(k + separator);
            }else {
                int x = j + k;
                System.out.print(x + separator);
                j = k;
                k = x;
            }
        }
    }
}
