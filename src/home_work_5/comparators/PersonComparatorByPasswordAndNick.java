package home_work_5.comparators;

import home_work_5.animal_and_person.Person;

import java.util.Comparator;

public class PersonComparatorByPasswordAndNick implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getPassword().length() - o2.getPassword().length() == 0){
            return o1.getNick().compareTo(o2.getNick());
        }
        return o1.getPassword().length() - o2.getPassword().length();
    }
}
