package home_work_1;

public class SleepOrNot {

    public static void main(String[] args) {

        if (sleepIn(false, true)){ // не рабочий день и отпуск
            System.out.println("Можно спать");
        }else {
            System.out.println("Нужно на работу");
        }

    }

    public static boolean sleepIn(boolean weekday, boolean vacation ){
        if (!weekday || vacation){
            return true;
        }
        return false;
    }
}
