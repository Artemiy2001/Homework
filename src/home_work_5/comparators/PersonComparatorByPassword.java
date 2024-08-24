package home_work_5.comparators;

import home_work_5.Person;

import java.util.Comparator;

public class PersonComparatorByPassword implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getPassword().length() - o2.getPassword().length();
    }
}
