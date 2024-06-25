package home_work_1;

import java.util.Arrays;

public class BinaryString {

    public static void main(String[] args) {

        byte num = 44;
        String byStr = toBinaryString(num);
        System.out.println(byStr);
    }

    public static String toBinaryString(byte num){

        int[] arrBit = new int[8];

        if(num < 0){                        // Проверка на отрицательность
            num *= -1;

            for (int i = 7; i >= 0; i--) {  // Обратный код
                if (num % 2 == 0) {
                    arrBit[i] = 1;
                } else {
                    arrBit[i] = 0;
                }
                num /= 2;
            }

            if(arrBit[0] == 0){                // Дополнительный код
                arrBit[0] = 1;
            }else {
                for (int j = 7; j >= 0; j--){
                    if (arrBit[j] == 1){
                        arrBit[j] = 0;
                    }else {
                        arrBit[j] = 1;
                        break;
                    }
                }
            }

        }else {
            for (int i = 7; i >= 0; i--) {
                arrBit[i] = num % 2;
                num /= 2;
            }

        }

        return Arrays.toString(arrBit);
    }
}
