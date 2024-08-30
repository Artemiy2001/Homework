package home_work_5;

import home_work_5.animal_and_person.Animal;
import home_work_5.animal_and_person.Person;
import home_work_5.comparators.AnimalComparatorByAge;
import home_work_5.comparators.AnimalComparatorByPasswordAndNick;
import home_work_5.comparators.PersonComparatorByPassword;
import home_work_5.comparators.PersonComparatorByPasswordAndNick;
import home_work_5.utils.Creator;
import home_work_5.utils.ListSorter;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        List<Animal> animalList = new LinkedList<>();
        Set<Person> personSet = new HashSet<>();
        Set<Animal> animalSet = new TreeSet<>(new AnimalComparatorByAge());

        int COLLECTION_SIZE = 100_000;

        long t1 = Creator.fillPersonList(personList, COLLECTION_SIZE);
        System.out.println("Заполнение ArrayList заняло: " + t1 + " милисекунд");
        long t2 = Creator.fillAnimalList(animalList, COLLECTION_SIZE);
        System.out.println("Заполнение LinkedList заняло: " + t2 + " милисекунд");
        long t3 = Creator.fillPersonList(personSet, COLLECTION_SIZE);
        System.out.println("Заполнение HashSet заняло: " + t3 + " милисекунд");
        long t4 = Creator.fillAnimalList(animalSet, COLLECTION_SIZE);
        System.out.println("Заполнение TreeSet заняло: " + t4 + " милисекунд");

        System.out.println("--------------");


        long sortTime1 = sorter(personList, new PersonComparatorByPasswordAndNick());
        System.out.println("Время сортировки ArrayList: " + sortTime1);

        List<Animal> newAnimalList = new ArrayList<>(animalList);
        long sortTime2 = sorter(newAnimalList, new AnimalComparatorByPasswordAndNick());
        animalList.removeAll(newAnimalList);
        System.out.println("Время сортировки LinkedList: " + sortTime2);

        new LinkedHashSet<Person>(personSet);
        long sortTime3 = sorter(new ArrayList<>(personSet), new PersonComparatorByPassword());
        System.out.println("Время сортировки HashSet: " + sortTime3);

        System.out.println("--------------");

        long t5 = System.currentTimeMillis();
        long passwordLength1 = 0;
        for (Person person : personList) {
            passwordLength1 += person.getPassword().length();
        }
        System.out.println("Длинна всех паролей: " + passwordLength1 + " символов");
        System.out.println("Время итерирования iterator: " + (System.currentTimeMillis() - t5));

        long t6 = System.currentTimeMillis();
        long passwordLength2 = 0;
        for (int i = 0; i < personList.size(); i++){
            passwordLength2 += personList.get(i).getPassword().length();

        }
        System.out.println("Длинна всех паролей: " + passwordLength2 + " символов");
        System.out.println("Время итерирования циклом: " + (System.currentTimeMillis() - t6));

        System.out.println("--------------");


        long t7 = System.currentTimeMillis();
        for (int i = 0; i < personList.size(); i++){
            personList.remove(i);
        }
        System.out.println("Время удаления элементов: " + (System.currentTimeMillis() - t7));








    }

    private static <T> long sorter(List<T> list, Comparator<T> comparator){

        long time = System.currentTimeMillis();
        ListSorter<T> listSorter = new ListSorter<>();
        listSorter.quickSort(list, comparator);

        return System.currentTimeMillis() - time;
    }




}
