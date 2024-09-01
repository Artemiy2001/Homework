package home_work_5.utils;

import home_work_5.animal_and_person.Animal;
import home_work_5.animal_and_person.Person;

import java.util.Collection;
import java.util.Random;

public class Creator {


    public static void testFill(Collection<Person> c, int count){

        for (int i = 0; i < count; i++){
            c.add(new Person(Randomiser.getRandomNickNameByFile(), Randomiser.generatePassword(), Randomiser.getRandomNameByFile()));
        }
    }


    public static long fillPersonList(Collection<Person> c, int count){

        long t = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            c.add(createPerson());
        }
        return System.currentTimeMillis() - t;
    }

    public static long fillAnimalList(Collection<Animal> c, int count){

        long t = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            c.add(createAnimal());
        }
        return System.currentTimeMillis() - t;
    }

    private static Person createPerson() {

        return new Person(Randomiser.getRandomNickNameByFile(), Randomiser.generatePassword(), Randomiser.getRandomNameByFile());

    }

    private static Animal createAnimal(){

        return new Animal(Randomiser.generateRandomAge(), Randomiser.getRandomNickByFile());


    }
}
