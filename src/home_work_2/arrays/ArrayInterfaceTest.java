package home_work_2.arrays;

import home_work_2.utils.ArrayUtil;

public class ArrayInterfaceTest {

    public static void main(String[] args) {

        IArraysOperation doWhileOperation = new DoWhileOperation();
        IArraysOperation whileOperation = new WhileOperation();
        IArraysOperation forOperation = new ForOperation();
        IArraysOperation forEachOperation = new ForEachOperation();

        int[] arr = ArrayUtil.arrayFromConsole();

        test(arr, doWhileOperation, whileOperation, forOperation, forEachOperation);
    }

    private static void test(int[] arr, IArraysOperation... iArraysOperations){
        for (IArraysOperation iArraysOperation: iArraysOperations){
            iArraysOperation.arrayToConsole(arr);
            System.out.println();
            iArraysOperation.secondValueToConsole(arr);
            System.out.println();
            iArraysOperation.reversArray(arr);
            System.out.println();
        }
    }
}
