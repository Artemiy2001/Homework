package home_work_2.arrays;

import home_work_2.utils.ArrayUtil;

public class ArraysIteration {

    public static void main(String[] args) {

        int[] container = ArrayUtil.arrayFromConsole();
        arrayToConsole(container);
        System.out.println();
        secondValueToConsole(container);
        System.out.println();
        reversArray(container);


    }

    private static void reversArray(int[] arr) {

        System.out.println("Выводим перевернутый массив");
        int i = arr.length - 1;
        do {
            System.out.print(arr[i] + " ");
            i--;
        }while (i >= 0);

        i = arr.length - 1;
        System.out.println();

        while (i >= 0){
            System.out.print(arr[i] + " ");
            i--;
        }

        System.out.println();

        for (int j = arr.length - 1; j >= 0; j--){
            System.out.print(arr[j] + " ");
        }

        System.out.println();

        i = arr.length - 1;
        for (int value : arr) {
            System.out.print(arr[i] + " ");
            i--;
        }



    }

    private static void secondValueToConsole(int[] arr) {
        System.out.println("Выводим каджый второй элемент");

        int i = 1;
        do {
            System.out.print(arr[i] + " ");
            i += 2;
        }while (i < arr.length);

        i = 1;
        System.out.println();

        while (i < arr.length){

            System.out.print(arr[i] + " ");

            i += 2;
        }

        System.out.println();

        for (i = 1; i < arr.length; i += 2){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        i = 0;
        for (int value : arr) {
            if (i % 2 != 0){
                System.out.print(value + " ");

            }
            i++;
        }

    }

    private static void arrayToConsole(int[] arr){
        System.out.println("Выводми каждый элемент");

        int i = 0;
        do {
            System.out.print(arr[i] + " ");
            i++;
        }while (i < arr.length);

        i = 0;
        System.out.println();

        while (i < arr.length){
            System.out.print(arr[i] + " ");i++;
        }

        System.out.println();

        for (i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
