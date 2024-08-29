package home_work_5.utils;

import home_work_5.Animal;
import home_work_5.Person;

import java.util.Collection;

public class Creator {


    public static void fillPersonList(Collection<Person> c, int count){

        for (int i = 0; i < count; i++){
            c.add(createPerson());
        }
    }

    public static void fillAnimalList(Collection<Animal> c, int count){

        for (int i = 0; i < count; i++){
            c.add(createAnimal());
        }
    }

    private static Person createPerson() {

        Person person = new Person();

        person.setName(Utils.getRandomNameByFile());
        person.setNick(Utils.getRandomNickNameByFile());
        person.setPassword(Utils.generatePassword());

        return person;

    }

    private static Animal createAnimal(){

        Animal animal = new Animal();

        animal.setAge(Utils.generateRandomAge());
        animal.setNick(Utils.getRandomNickByFile());

        return animal;
    }
}
