package home_work_5;

import com.sun.jdi.CharValue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class Utils {


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
            name.append((char) random.nextInt(1040, 1103));
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
}
