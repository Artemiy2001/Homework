package home_work_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class TopWords {

    private static Map<String, Integer> mapWords = new HashMap<>();


    public static void getTopWords(Path path){
        String warAndPeace = null;
        try {
            warAndPeace = Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String[] arrWords = warAndPeace.split("[ ,.&?:;!()\"'\n-]+");

        for (int i = 0; i < arrWords.length; i++) {
            if (mapWords.containsKey(arrWords[i])){
                mapWords.put(arrWords[i], mapWords.get(arrWords[i]) + 1);
            }else {
                mapWords.put(arrWords[i], 1);
            }
        }


        mapWords.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(5)
                .forEach(System.out::println);

    }



}
