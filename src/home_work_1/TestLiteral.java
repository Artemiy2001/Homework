package home_work_1;

public class TestLiteral {

    public static void main(String[] args) {

        double lit = 42.5;

        int litInt = 42;

        // lit = lit & 23;  ошибка

        // lit = lit << 2;  ошибка

        litInt = litInt & 23;
        System.out.println(litInt); // выводит 2

        litInt = litInt << 2;
        System.out.println(litInt); // выводит 8

        // побитовые операторы работают только с целочисленными типами


    }
}
