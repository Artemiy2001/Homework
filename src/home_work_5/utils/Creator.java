package home_work_5.utils;

import home_work_5.Animal;
import home_work_5.Person;

public class Creator {

    public static Person createPerson() {

        Person person = new Person();

        person.setName(Utils.getRandomNameByFile());
        person.setNick(Utils.getRandomNickNameByFile());
        person.setPassword(Utils.generatePassword());

        return person;

    }

    public static Animal createAnimal(){

        Animal animal = new Animal();

        animal.setAge(Utils.generateRandomAge());
        animal.setNick(Utils.getRandomNickByFile());

        return animal;
    }
}
