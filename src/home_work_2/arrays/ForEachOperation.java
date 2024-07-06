package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {


    @Override
    public void arrayToConsole(int[] arr) {

        System.out.println("Выводми каждый элемент циклом forEach: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    @Override
    public void secondValueToConsole(int[] arr) {

        System.out.println("Выводим каджый второй элемент циклом forEach: ");
        int i = 0;
        for (int value : arr) {
            if (i % 2 != 0){
                System.out.print(value + " ");

            }
            i++;
        }
    }

    @Override
    public void reversArray(int[] arr) {

        System.out.println("Выводим перевернутый массив циклом forEach: ");
        int i = arr.length - 1;
        for (int value : arr) {
            System.out.print(arr[i] + " ");
            i--;
        }
    }
}
