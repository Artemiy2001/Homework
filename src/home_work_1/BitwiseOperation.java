package home_work_1;

import java.util.Arrays;
import java.util.Scanner;

public class BitwiseOperation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: "); // ввод числа 23
        int firstNum = in.nextInt();

        System.out.print("Введите второе число: "); // ввод числа 32
        int secondNum = in.nextInt();

        System.out.print(firstNum + " в двоичной системе: "); // 23 в двоичной - 0 0 0 1 0 1 1 1
        toBinary(firstNum);

        System.out.print(secondNum + " в двоичной системе: "); // 32 в двоичной - 0 0 1 0 0 0 0 0
        toBinary(secondNum);


        int result = firstNum | secondNum;

        int result2 = firstNum & secondNum;

        System.out.print(firstNum +  " | " + secondNum + " = " + result + " - "); // результат 23 | 32 = 55 - 0 0 1 1 0 1 1 1
        toBinary(result);
        System.out.print(firstNum +  " & " + secondNum + " = " + result2 + " - "); // результат 23 & 32 = 0 - 0 0 0 0 0 0 0 0
        toBinary(result2);


    }

    public static void toBinary(int num){
        int[] arrBit = new int[8];
        for (int i = 7; i >= 0; i--){
            arrBit[i] = num % 2;
            num /= 2;
        }
        System.out.println(Arrays.toString(arrBit));
    }

}
