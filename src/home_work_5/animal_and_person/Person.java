package home_work_5.animal_and_person;

public class Person {

    private String nick;
    private String password;
    private String name;

    public Person() {

    }

    public Person(String nick, String password, String name) {
        this.nick = nick;
        this.password = password;
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nick: '" + nick + '\'' +
                ", password: '" + password + '\'' +
                ", name: '" + name + '\'' +
                '}';
    }
}
