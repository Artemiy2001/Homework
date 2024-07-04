package home_work_2.loops;

import java.math.BigInteger;
import java.util.Random;

//* Умножать число long a = 1; пока не произойдёт переполнение. В конце в консоль вывести сообщение со значением до переполнения и после переполнения. Умножать на:
//    	1.4.1. 3
//    	1.4.2. 188
//    	1.4.3. -19
//    	1.4.4. Да и вообще на любое целочисленное

public class Main4 {

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
                    multiplier *= -1;
                }else {
                    System.out.println("Число long: " + (-num));
                }
            }else {
                while (num * multiplier > 0){
                    num *= multiplier;
                }
                System.out.println("Число long: " + num);

            }

            BigInteger bigInteger = new BigInteger(Long.toString(num));
            BigInteger bigInteger1 = new BigInteger(Integer.toString(multiplier));
            BigInteger bigInteger2 = bigInteger.multiply(bigInteger1);
            System.out.println("Число больше long: " + bigInteger2);
            System.out.println();
        }


    }
}
