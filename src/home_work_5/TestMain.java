package home_work_5;

import home_work_5.animal_and_person.Person;
import home_work_5.utils.Creator;

import java.util.LinkedList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {

        List<Person> personList = new LinkedList<>();

        Creator.testFill(personList, 100_000);


    }
}
