package home_work_4;

public class StringComparatorByLength implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}