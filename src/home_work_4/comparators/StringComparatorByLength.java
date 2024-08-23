package home_work_4.comparators;

import home_work_4.list.Comparator;

public class StringComparatorByLength implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
