package home_work_1;

import java.util.Scanner;

public class TryToDiv {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите делимое: ");
        int num1 = in.nextInt();

        System.out.print("Введите делитель: ");
        int num2 = in.nextInt();

        int res = num1 / num2;
        if (num1 % num2 == 0){
            System.out.println("Результат деления: " + res);
        }else {
            int rem = num1 % num2;
            System.out.println("Результат деления: " + res + " целых и " + rem + " в остатке");
        }
    }
}
