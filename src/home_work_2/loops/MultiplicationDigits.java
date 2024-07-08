package home_work_2.loops;

import java.util.Scanner;

public class MultiplicationDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        String value = scanner.nextLine();
        if (value.matches("\\d+")){
            int result = getMulti(value);
            System.out.println(result);
        } else if (value.contains(".")) {
            System.out.println("Введено не целое число");
        } else {
            System.out.println("Введено не число");
        }


    }

    private static int getMulti(String value) {
        int result = 1;
        for (int i = 0; i < value.length(); i++){
            result *= Integer.parseInt(Character.toString(value.charAt(i)));
            System.out.print(value.charAt(i));
            if (i == value.length() - 1){
                System.out.print(" = ");
            }else {
                System.out.print(" * ");
            }
        }
        return result;
    }
}
