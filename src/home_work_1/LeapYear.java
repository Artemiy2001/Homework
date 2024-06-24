package home_work_1;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = in.nextInt();

        if (year % 400 == 0){
            System.out.println(year + " год - високосный");
        } else if (year % 100 == 0) {
            System.out.println(year + " год - невисокосный");
        } else if (year % 4 == 0) {
            System.out.println(year + " год - високосный");
        }else {
            System.out.println(year + " год - невисокосный");
        }
    }
}
