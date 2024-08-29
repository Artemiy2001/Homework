package home_work_5.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Utils {


    public static String generatePassword(){

        Random random = new Random();
        StringBuilder password = new StringBuilder();
        int passwordLength = random.nextInt(5, 11);
        for (int i = 0; i < passwordLength; i++){
            password.append((char) random.nextInt(65, 125));
        }

        return password.toString();
    }

    public static String generateRandomString(){
        Random random = new Random();
        int stringLength = random.nextInt(10) + 1;
        StringBuilder name = new StringBuilder();
        for (int i = 0; stringLength > i; i++){
            name.append((char) random.nextInt(65, 125));
        }
        return name.toString();
    }

    public static String generateRandomRussionString(){

        Random random = new Random();
        int stringLength = random.nextInt(10) + 1;
        StringBuilder name = new StringBuilder();
        for (int i = 0; stringLength > i; i++){
            name.append((char) random.nextInt(1040, 1104));
        }
        return name.toString();
    }

    public static String generateRandomEnglishString(){

        Random random = new Random();
        int stringLength = random.nextInt(10) + 1;
        StringBuilder name = new StringBuilder();
        for (int i = 0; stringLength > i; i++){
            if(random.nextBoolean()){
                name.append((char) random.nextInt(65, 91));
            }else {
                name.append((char) random.nextInt(97, 123));
            }
        }
        return name.toString();
    }

    public static String getRandomNameByFile(){
        Path path = Path.of("src","home_work_5", "resources", "AllNames");
        String str;
        try {
            str = Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        str = str.replaceAll("\n","");
        str = str.replaceAll(" ", "");
        String[] arrString = str.split(",");

        Random random = new Random();
        return arrString[random.nextInt(0, arrString.length)];


    }

    public static String getRandomNickByFile(){
        Path path = Path.of("src","home_work_5", "resources", "AllNicks");
        String str;
        try {
            str = Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        str = str.replaceAll("\n","");
        str = str.replaceAll(" ", "");
        String[] arrString = str.split(",");

        Random random = new Random();
        return arrString[random.nextInt(0, arrString.length)];


    }

    public static String getRandomNickNameByFile(){
        Path path = Path.of("src","home_work_5", "resources", "AllNickName");
        List<String> nickNameList = new ArrayList<>();
        Random random = new Random();

        Scanner scanner;
        try {
            scanner = new Scanner(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (scanner.hasNextLine()){
            nickNameList.add(scanner.nextLine());
        }

        return nickNameList.get(random.nextInt(0, nickNameList.size()));
    }

    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(1, 16);
    }
}
