package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {


    @Override
    public void arrayToConsole(int[] arr) {

        System.out.println("Выводим каджый элемент циклом while: ");
        int i = 0;
        while (i < arr.length){
            System.out.print(arr[i] + " ");i++;
        }
    }

    @Override
    public void secondValueToConsole(int[] arr) {

        System.out.println("Выводим каджый второй элемент циклом while: ");
        int i = 1;
        while (i < arr.length){

            System.out.print(arr[i] + " ");

            i += 2;
        }
    }

    @Override
    public void reversArray(int[] arr) {

        System.out.println("Выводим перевернутый массив циклом while: ");
        int i = arr.length - 1;
        while (i >= 0){
            System.out.print(arr[i] + " ");
            i--;
        }
    }
}
