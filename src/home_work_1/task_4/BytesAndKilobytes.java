package home_work_1.task_4;

import java.util.Scanner;

public class BytesAndKilobytes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Нажмите 1 для выбора байт или 2 для выбора килобайт: ");
        int num1 = in.nextInt();

        if (num1 == 1){
            System.out.print("Введите количество байт: ");
            int num2 = in.nextInt();
            int res = num2 / 1024;
            System.out.println("В " + num2 + " байтах: " + res + " килобайт");
        }else {
            System.out.print("Введите количество килобайт: ");
            int num2 = in.nextInt();
            int res = num2 * 1024;
            System.out.println("В " + num2 + " килобайтах: " + res + " байт");
        }
    }
}
