package home_work_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Path path = Path.of("src", "home_work_6", "rescources", "Война и мир_книга.txt");

        Set<String> setWords = AllWardsWarAndPeace.getWords(path);

        setWords.stream()
                .filter(s1 -> s1.charAt(0) == 'я')
                .forEach(System.out::println);

        System.out.println();


        System.out.println("Топ 5 встречающихся слов: ");
        TopWords.getTopWords(path);

        EasySearch easySearch = new EasySearch();

        String WarAndPeace = null;
        try {
            WarAndPeace = Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println();

        System.out.println("Слов 'война' - " + easySearch.search(WarAndPeace, "война"));
        System.out.println("Слов 'и' - " + easySearch.search(WarAndPeace, "и"));
        System.out.println("Слов 'мир' - " + easySearch.search(WarAndPeace, "мир"));






    }
}
