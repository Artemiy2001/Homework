package home_work_1.task_6;

import java.util.Scanner;

public class AnastasiaCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        if(name.equals("Вася")){
            System.out.println("Привет! \nЯ тебя так долго ждал");
        }else if (name.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        }else {
            System.out.println("Ты кто такой");
        }
    }
}
