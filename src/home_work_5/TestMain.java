package home_work_5;

import home_work_5.animal_and_person.Person;
import home_work_5.comparators.PersonComparatorByPassword;
import home_work_5.comparators.PersonComparatorByPasswordAndNick;
import home_work_5.utils.Creator;
import home_work_5.utils.ListSorter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        ListSorter<Person> sorter = new ListSorter<>();

        long t = System.currentTimeMillis();

        Creator.testFill(personList, 100_0000);

        sorter.quickSort(personList, new PersonComparatorByPassword());


        System.out.println(System.currentTimeMillis() - t);




    }
}
