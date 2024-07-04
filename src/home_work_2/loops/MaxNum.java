package home_work_2.loops;

import java.util.Scanner;

public class MaxNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        int num = scanner.nextInt();

        int maxNum = findMaxNum(num);
        System.out.println(maxNum);
    }

    private static int findMaxNum(int num) {
        int maxNum = 0;
        while (num > 0){
            if (num % 10 > maxNum){
                maxNum = num % 10;
            }
            num /= 10;
        }
        return maxNum;
    }
}
