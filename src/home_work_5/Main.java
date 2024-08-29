package home_work_5;

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

        for (int i = 0; i < 10000; i++){

            personList.add(Creator.createPerson());
            animalList.add(Creator.createAnimal());
            personSet.add(Creator.createPerson());
            animalSet.add(Creator.createAnimal());

        }


        long sortTime1 = sorter(personList, new PersonComparatorByPasswordAndNick());
        System.out.println("Время сортировки ArrayList: " + sortTime1);

        long sortTime2 = sorter(animalList, new AnimalComparatorByPasswordAndNick());
        System.out.println("Время сортировки LinkedList: " + sortTime2);

        long sortTime3 = sorter(new ArrayList<>(personSet), new PersonComparatorByPassword());
        System.out.println("Время сортировки HashSet: " + sortTime3);

//        long t1 = System.currentTimeMillis();
//        for (Person person : personList) {
//            System.out.print(person.getPassword().length() + "-" + person.getNick().charAt(0) + ", ");
//        }
//        System.out.println();

//        System.out.println("Время итерирования iterator: " + (System.currentTimeMillis() - t1));

//        long t2 = System.currentTimeMillis();
//        for (int i = 0; i < personList.size(); i++){
//            System.out.print(personList.get(i).getPassword().length() + "-" + personList.get(i).getNick().charAt(0) + ", ");
//        }
//        System.out.println();
//        System.out.println("Время итерирования циклом: " + (System.currentTimeMillis() - t2));







    }

    private static <T> long sorter(List<T> list, Comparator<T> comparator){

        long time = System.currentTimeMillis();
        ListSorter<T> listSorter = new ListSorter<>();
        listSorter.quickSort(list, comparator);

        return System.currentTimeMillis() - time;
    }




}
