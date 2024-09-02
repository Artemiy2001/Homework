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

        //Создаем различные коллекции

        List<Person> personList = new ArrayList<>();
        List<Animal> animalList = new LinkedList<>();
        Set<Person> personSet = new HashSet<>();
        Set<Animal> animalSet = new TreeSet<>(new AnimalComparatorByAge());

        final int COLLECTION_SIZE = 1_000_000; // Кол-во обьектов в коллекции

        //Заполняем коллекции

        long t1 = Creator.fillPersonList(personList, COLLECTION_SIZE);
        System.out.println("Заполнение ArrayList заняло: " + t1 + " милисекунд");
        long t2 = Creator.fillAnimalList(animalList, COLLECTION_SIZE);
        System.out.println("Заполнение LinkedList заняло: " + t2 + " милисекунд");
        long t3 = Creator.fillPersonList(personSet, COLLECTION_SIZE);
        System.out.println("Заполнение HashSet заняло: " + t3 + " милисекунд");
        long t4 = Creator.fillAnimalList(animalSet, COLLECTION_SIZE);
        System.out.println("Заполнение TreeSet заняло: " + t4 + " милисекунд");

        System.out.println("--------------");

        //Сортируем все коллекции кроме TreeSet т.к. она уже отсортирована

        long sortTime1 = sorter(personList, new PersonComparatorByPassword());
        System.out.println("Время сортировки по длинне пароля ArrayList: " + sortTime1);

        List<Animal> newAnimalList = new ArrayList<>(animalList);
        long sortTime2 = sorter(newAnimalList, new AnimalComparatorByPasswordAndNick());
        animalList = new LinkedList<>(newAnimalList);
        System.out.println("Время сортировки LinkedList по паролю и нику: " + sortTime2);

        long time = System.currentTimeMillis();
        List<Person> newPersonList = new ArrayList<>(personSet);
        newPersonList.sort(new PersonComparatorByPasswordAndNick());
        personSet = new LinkedHashSet<>(newPersonList);
        System.out.println("Время сортирови HashSet встроенным сортировщиком: " + (System.currentTimeMillis() - time));


        System.out.println("--------------");

        //Получаем общую длинну всех паролей в ArrayList с помощью iterator

        long t5 = System.currentTimeMillis();
        long passwordLength1 = 0;
        for (Person person : personList) {
            passwordLength1 += person.getPassword().length();
        }
        System.out.println("Длинна всех паролей в списке: " + passwordLength1 + " символов");
        System.out.println("Время итерирования iterator: " + (System.currentTimeMillis() - t5));

        //Получаем общую длинну всех паролей в ArrayList с помощью цикла for

        long t6 = System.currentTimeMillis();
        long passwordLength2 = 0;
        for (int i = 0; i < personList.size(); i++){
            passwordLength2 += personList.get(i).getPassword().length();

        }
        System.out.println("Длинна всех паролей в списке: " + passwordLength2 + " символов");
        System.out.println("Время итерирования циклом: " + (System.currentTimeMillis() - t6));

        System.out.println("--------------");

        //Очищаем список ArrayList

        long t7 = System.currentTimeMillis();

        personList.clear();

        System.out.println("Время удаления элементов: " + (System.currentTimeMillis() - t7));




    }

    private static <T> long sorter(List<T> list, Comparator<T> comparator){

        long time = System.currentTimeMillis();

        ListSorter<T> listSorter = new ListSorter<>();
        listSorter.quickSort(list, comparator);

        return System.currentTimeMillis() - time;
    }




}
