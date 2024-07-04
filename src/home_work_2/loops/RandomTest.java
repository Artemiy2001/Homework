package home_work_2.loops;

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {

        Random rnd = new Random();


        int counterEven = 0;
        int counterOdd = 0;

        for (int i = 0; i < 1000; i++){
            if (rnd.nextInt(100) % 2 == 0){
                counterEven++;
            }else {
                counterOdd++;
            }
        }

        System.out.println("Выпало четных чисел: " + counterEven);
        System.out.println("Выпало нечетных чисел: " + counterOdd);
    }
}
