package home_work_1.task_4;

import java.util.Scanner;

public class AvgNum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = in.nextInt();

        int res;

        if (num1 > num2 && num1 < num3){
            res = num1;
        } else if (num2 > num1 && num2 < num3) {
            res = num2;
        }else {
            res = num3;
        }

        System.out.println(res);
    }
}
