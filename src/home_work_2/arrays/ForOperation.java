package home_work_2.arrays;

public class ForOperation implements IArraysOperation {


    @Override
    public void arrayToConsole(int[] arr) {

        System.out.println("Выводми каждый элемент циклом for: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    @Override
    public void secondValueToConsole(int[] arr) {

        System.out.println("Выводим каджый второй элемент циклом for: ");
        for (int i = 1; i < arr.length; i += 2){
            System.out.print(arr[i] + " ");
        }
    }

    @Override
    public void reversArray(int[] arr) {

        System.out.println("Выводим перевернутый массив циклом for: ");
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }

    }
}
