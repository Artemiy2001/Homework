package home_work_5.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;

public class Randomiser {

    private static final Path pathNicks = Path.of("src","home_work_5", "resources", "AllNicks");

    private static final Path pathNickNames = Path.of("src","home_work_5", "resources", "AllNickName");

    private static final Path pathNames = Path.of("src","home_work_5", "resources", "AllNames");

    private static final Random random = new Random();

    private static final List<String> nickNameList;
    private static final List<String> nickList;
    private static final List<String> nameList;

    static {
        try {
            nickNameList = Files.readAllLines(pathNickNames);
            nickList = List.of(Files.readString(pathNicks).split("[,\n\\s]+"));
            nameList = List.of(Files.readString(pathNames).split("[,\n\\s]+"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static String generatePassword(){

        StringBuilder password = new StringBuilder();
        int passwordLength = random.nextInt(5, 111);
        for (int i = 0; i < passwordLength; i++){
            password.append((char) random.nextInt(65, 125));
        }

        return password.toString();
    }

    public static String generateRandomString(){

        int stringLength = random.nextInt(10) + 1;
        StringBuilder name = new StringBuilder();
        for (int i = 0; stringLength > i; i++){
            name.append((char) random.nextInt(65, 125));
        }
        return name.toString();
    }

    public static String generateRandomRussionString(){

        int stringLength = random.nextInt(10) + 1;
        StringBuilder name = new StringBuilder();
        for (int i = 0; stringLength > i; i++){
            name.append((char) random.nextInt(1040, 1104));
        }
        return name.toString();
    }

    public static String generateRandomEnglishString(){

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


        return nameList.get(random.nextInt(0, nameList.size()));

    }

    public static String getRandomNickByFile(){


        return nickList.get(random.nextInt(0, nickList.size()));

    }

    public static String getRandomNickNameByFile(){


        return nickNameList.get(random.nextInt(0, nickNameList.size()));
    }

    public static int generateRandomAge(){

        return random.nextInt(1, 16);
    }
}
