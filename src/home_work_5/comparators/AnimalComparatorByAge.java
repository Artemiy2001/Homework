package home_work_5.comparators;


import home_work_5.animal_and_person.Animal;

import java.util.Comparator;

public class AnimalComparatorByAge implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
