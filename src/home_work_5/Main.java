package home_work_5;

import home_work_5.comparators.AnimalComparatorByAge;
import home_work_5.comparators.PersonComparatorByPassword;
import home_work_5.comparators.PersonComparatorByPasswordAndNick;
import home_work_5.utils.ListSorter;
import home_work_5.utils.Utils;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < 1000; i++){

            personList.add(createPerson());

        }

        long time = System.currentTimeMillis();


        ListSorter<Person> listSorter = new ListSorter<>();
        System.out.println(personList);

        listSorter.listSort(personList, new PersonComparatorByPasswordAndNick());

        System.out.println(personList);



        System.out.println(System.currentTimeMillis() - time);






    }

    private static Person createPerson() {

        Person person = new Person();

        person.setName(Utils.getRandomNameByFile());
        person.setNick(Utils.getRandomNickNameByFile());
        person.setPassword(Utils.generatePassword());

        return person;

    }


}
