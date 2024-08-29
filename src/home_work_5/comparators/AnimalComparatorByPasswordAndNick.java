package home_work_5.comparators;

import home_work_5.animal_and_person.Animal;

import java.util.Comparator;

public class AnimalComparatorByPasswordAndNick implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getAge() - o2.getAge() == 0){
            return o1.getNick().compareTo(o2.getNick());
        }
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
