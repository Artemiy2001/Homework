package home_work_1.task_4;

import java.util.Scanner;

public class LetterCheck {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите код символа: ");
        int ch = in.nextInt();

        if (ch > 64 && ch < 91 || ch > 96 && ch < 123){
            char res = (char) ch;
            System.out.println("Вы ввели букву : " + res);
        }else {
            System.out.println("Вы ввели неизвестный символ");
        }


    }
}
