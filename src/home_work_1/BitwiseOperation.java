package home_work_1;

import java.util.Scanner;

public class BitwiseOperation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNum = in.nextInt();

        System.out.print("Введите второе число: ");
        int secondNum = in.nextInt();

        System.out.println("Вы ввели: " + firstNum + " и " + secondNum);

        int result = firstNum | secondNum;

        System.out.println(result);

        System.out.println("test");

        System.out.println("test 3");
    }
}
