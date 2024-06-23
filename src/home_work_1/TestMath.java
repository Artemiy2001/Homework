package home_work_1;

public class TestMath {

    public static void main(String[] args) {

        System.out.println(Math.PI); // выводит число пи
        System.out.println(Math.sin(Math.PI / 6)); // принимает значение в радианах, выводит синус 30 градусов
        System.out.println(Math.toDegrees(Math.PI / 6)); // принимет значение в радианах, выводит градусы
        System.out.println(Math.toRadians(30)); // приниает значение в градусах выводит в радианах
        System.out.println(Math.pow(3, 4)); // выводит 3 в степени 4
        System.out.println(Math.sqrt(81)); // выводит корень 81
        System.out.println(Math.ceil(3.2)); // округляет в большую сторону
        System.out.println(Math.floor(4.8)); // округляет в меньшую сторону
        System.out.println(Math.round(3.5)); // округляет от 0.5 в большую сторону до 0.5 в меньшую
        System.out.println(Math.min(2, 9)); // выводит меньшее число
        System.out.println(Math.max(2, 9)); // выводит большее число
        System.out.println(Math.random()); // выводит рандомное число от 0.0 до 1.0
    }
}
