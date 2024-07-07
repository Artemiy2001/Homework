package home_work_2.arrays;

import home_work_2.utils.ArrayUtil;

import java.util.Arrays;

public class ArrayTasks {

    public static void main(String[] args) {

        int[] arr = ArrayUtil.arrayRandom(50, 100);
        
        int sumEven = sumOfEven(arr);
        System.out.println("Суммма четных положительных чисел массива: " + sumEven);

        int maxElement = maxElementEvenIndex(arr);
        System.out.println("Максимальный элемент с четными индексом: " + maxElement);

        int[] belowAverage = elementsBelowAverage(arr);
        System.out.println("Элементы меньше среднего: " + Arrays.toString(belowAverage));

        int [] twoMinEl = twoMinElements(arr);
        System.out.println("Два наименьших элемента: " + Arrays.toString(twoMinEl));
    }

    private static int[] twoMinElements(int[] arr) {
        int[] twoMinEl = new int[2];
        int minEl = arr[0];
        int indexMinEl = 0;
        for (int i = 0; i < arr.length; i ++){
            if (arr[i] < minEl){
                twoMinEl[0] = arr[i];
                minEl = arr[i];
                indexMinEl = i;
            }
        }
        if (indexMinEl != 0){
            minEl = arr[0];
        }else {
            minEl = arr[1];
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minEl && indexMinEl != i){
                twoMinEl[1] = arr[i];
                minEl = arr[i];
            }
        }
        return twoMinEl;
    }

    private static int[] elementsBelowAverage(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        int averageValue = sum / arr.length;
        int sizeNewArr = 0;
        for (int value : arr){
            if (value < averageValue){
                sizeNewArr++;
            }
        }
        int[] resultArr = new int[sizeNewArr];
        int counterIndex = 0;
        for (int value : arr) {
            if (value < averageValue){
                resultArr[counterIndex] = value;
                counterIndex++;
            }
        }
        return resultArr;
    }

    private static int maxElementEvenIndex(int[] arr) {

        int maxElement = 0;
        for (int i = 0; i < arr.length; i++){
            if (maxElement < arr[i] && i % 2 == 0){
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    private static int sumOfEven(int[] arr) {

        int sum = 0;
        for (int value : arr) {
            if (value % 2 == 0 && value > 0){
                sum += value;
            }
        }
        return sum;
    }


}
