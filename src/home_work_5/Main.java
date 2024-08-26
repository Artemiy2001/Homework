package home_work_5;

import home_work_5.comparators.PersonComparatorByPasswordAndNick;
import home_work_5.utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < 100; i++){

            personList.add(createPerson());

        }

        personList.sort(new PersonComparatorByPasswordAndNick());

        System.out.println(personList);



    }

    private static Person createPerson() {

        Person person = new Person();

        person.setName(Utils.getRandomNameByFile());
        person.setNick(Utils.getRandomNickNameByFile());
        person.setPassword(Utils.generatePassword());

        return person;

    }


}
