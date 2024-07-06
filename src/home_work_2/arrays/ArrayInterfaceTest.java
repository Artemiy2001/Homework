package home_work_2.arrays;

import home_work_2.utils.ArrayUtil;

public class ArrayInterfaceTest {

    public static void main(String[] args) {

        DoWhileOperation doWhileOperation = new DoWhileOperation();

        int[] arr = ArrayUtil.arrayFromConsole();

        doWhileOperation.arrayToConsole(arr);
    }
}
