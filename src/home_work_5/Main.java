package home_work_5;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++){
            System.out.println(Utils.generateRandomString());
            System.out.println(Utils.generateRandomRussionString());
            System.out.println(Utils.getRandomNameByFile());
            System.out.println(Utils.getRandomNickByFile());
            System.out.println();
        }





    }
}
