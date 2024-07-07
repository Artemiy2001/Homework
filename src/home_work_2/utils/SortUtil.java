package home_work_2.utils;

public class SortUtil {

    public static int[] shake(int[] arr){

        boolean flag = true;
        int left = 0;
        int right = arr.length - 1;

        while (flag){

            flag = false;
            for (int i = left; i < right; i++){
                int box;
                if (arr[i] > arr[i + 1]){
                    box = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = box;
                    flag = true;
                }
            }
            right--;

            for (int i = right; i > left; i--){
                int box;
                if (arr[i] < arr[i - 1]){
                    box = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = box;
                    flag = true;
                }
            }
            left++;
        }
        return arr;
    }

    public static int[] sort(int[] arr){

        boolean flag = true;

        while (flag){
            flag = false;
            for (int i = 0; i < arr.length - 1; i++){
                int box;
                if (arr[i] > arr[i + 1]){
                    box = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = box;
                    flag = true;
                }
            }
        }
        return arr;
    }
}
