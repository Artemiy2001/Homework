package home_work_2.loops;

import java.math.BigInteger;
import java.util.Random;

public class Overflow {

    public static void main(String[] args) {

        Random rnd = new Random();

        int multiplier1 = 3;
        int multiplier2 = 188;
        int multiplier3 = -19;
        int multiplier4 = rnd.nextInt();

        int[] multiplierArr = new int[]{multiplier1, multiplier2, multiplier3, multiplier4};

        for (int multiplier : multiplierArr) {
            long num = 1;

            if (multiplier < 0){
                multiplier *= -1;
                int counter = 0;
                while (num * multiplier > 0){
                    counter++;
                    num *= multiplier;
                }
                if (counter % 2 == 0){
                    System.out.println("Число long: " + num);
                    System.out.println("Переполненный long: " + (num * multiplier));
                    multiplier *= -1;
                }else {
                    System.out.println("Число long: " + (-num));
                    System.out.println("Переполненный long: " + (num * multiplier));
                }
            }else {
                while (num * multiplier > 0){
                    num *= multiplier;
                }
                System.out.println("Число long: " + num);
                System.out.println("Переполненный long: " + (num * multiplier));

            }

            BigInteger bigInteger1 = new BigInteger(Long.toString(num));
            BigInteger bigInteger2 = new BigInteger(Integer.toString(multiplier));
            BigInteger bigIntegerResult = bigInteger1.multiply(bigInteger2);
            System.out.println("Число больше long: " + bigIntegerResult);
            System.out.println();
        }


    }
}
