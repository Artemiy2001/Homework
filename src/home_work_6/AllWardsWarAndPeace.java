package home_work_6;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class AllWardsWarAndPeace {


    private static final Set<String> setWords = new HashSet<>();

    public static void getWords(Path path){
        String warAndPeace = null;
        try {
            warAndPeace = Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String[] newWarAndPeace = warAndPeace.split("[ ,.&?:;!()\"'\n-]+");
        setWords.addAll(Arrays.asList(newWarAndPeace));
    }













}
