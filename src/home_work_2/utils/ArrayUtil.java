package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {

    public static int[] arrayFromConsole(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int arr[] = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++){
            System.out.print("Введите значение по индексу " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion){

        int arr[] = new int[size];

        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(maxValueExclusion);
        }

        return arr;

    }
}
