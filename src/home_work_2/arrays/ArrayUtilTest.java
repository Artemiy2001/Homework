package home_work_2.arrays;

import home_work_2.utils.ArrayUtil;

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {

        int[] container = ArrayUtil.arrayFromConsole();
        System.out.println(Arrays.toString(container));

        int[] container2 = ArrayUtil.arrayRandom(4, 59);
        System.out.println(Arrays.toString(container2));
    }
}
