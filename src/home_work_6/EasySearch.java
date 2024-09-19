package home_work_6;

public class EasySearch implements ISearch{


    @Override
    public long search(String text, String word) {
        int index = 0;
        int counterWords = 0;
        while (text.indexOf(word, index) != -1){

            index = text.indexOf(word, index);

            boolean firstBool = index == 0 || !Character.isLetter(text.charAt(index - 1));
            boolean secondBool = ((index + word.length()) == text.length()) || !Character.isLetter(text.charAt((index + word.length())));

            if (firstBool && secondBool){
                counterWords++;
            }

            index = text.indexOf(word, index) + word.length();
        }
        return counterWords;
    }
}
