package home_work_5.animal_and_person;

public class Animal {

    private int age;
    private String nick;

    public Animal() {

    }

    public Animal(int age, String nick) {
        this.age = age;
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age: " + age +
                ", nick: '" + nick + '\'' +
                '}';
    }
}
