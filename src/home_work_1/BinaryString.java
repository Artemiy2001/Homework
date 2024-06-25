package home_work_1;

import java.util.Arrays;

public class BinaryString {

    public static void main(String[] args) {

        byte num = 15;
        String byStr = toBinaryString(num);
        System.out.println(byStr);
    }

    public static String toBinaryString(byte num){
        int[] arrBit = new int[8];
        for (int i = 7; i >= 0; i--) {
            arrBit[i] = num % 2;
            num /= 2;
        }
        return Arrays.toString(arrBit);
    }
}
