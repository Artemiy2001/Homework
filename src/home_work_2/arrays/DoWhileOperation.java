package home_work_2.arrays;

import home_work_2.utils.ArrayUtil;

public class DoWhileOperation implements IArraysOperation{


    @Override
    public void arrayToConsole(int[] arr) {

        System.out.println("Выводми каждый элемент");

        int i = 0;
        do {
            System.out.print(arr[i] + " ");
            i++;
        }while (i < arr.length);

        i = 0;
        System.out.println();

    }

    @Override
    public void secondValueToConsole(int[] arr) {

        System.out.println("Выводим каджый второй элемент");

        int i = 1;
        do {
            System.out.print(arr[i] + " ");
            i += 2;
        }while (i < arr.length);



    }

    @Override
    public void reversArray(int[] arr) {

        System.out.println("Выводим перевернутый массив");
        int i = arr.length - 1;
        do {
            System.out.print(arr[i] + " ");
            i--;
        }while (i >= 0);


    }
}
