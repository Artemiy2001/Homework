package home_work_1.task_6;

import java.util.Scanner;

public class NameCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        switch (name){
            case "Вася":
                System.out.println("Привет! \nЯ тебя так долго ждал");
                break;

            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;

            default:
                System.out.println("Добрый день, а вы кто?");
        }

    }
}
