package home_work_2.sorts;

import home_work_2.utils.ArrayUtil;

import java.util.Arrays;

public class SortsTest {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 1, 1, 1};
        int[] arr3 = {9, 1, 5, 99, 9, 9};
        int[] arr4 = {};
        int[] arr5 = {6, 5, 4, 3, 2, 1};
        int[] arrRandom = ArrayUtil.arrayRandom(50, 100);
        int[] arrFromConsole = ArrayUtil.arrayFromConsole();


        int[][] testArr = new int[][]{arr1, arr2, arr3, arr4, arr5, arrRandom, arrFromConsole};

        testSortArray(testArr);
    }

    private static void testSortArray(int[][] testArr) {

        for (int[] arr : testArr){
            System.out.println();
            System.out.println("Массив до сортировки:" + Arrays.toString(arr));
            System.out.println("Массив отсортирован пузырьком: " + Arrays.toString(SortArray.sort(arr)));
            System.out.println("Массив отсортирован шейкером: " + Arrays.toString(SortArray.shake(arr)));

        }
    }
}
