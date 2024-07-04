package home_work_2.loops;

import java.util.Scanner;

public class RangeNum {

    public static void main(String[] args) {

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
    }
}
