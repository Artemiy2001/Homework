package home_work_4;

import java.util.Arrays;

public class DataContainerDemo {

    public static void main(String[] args) {

        ArtemList<String> dataContainer = new DataContainer<>(String.class);



        int index1 = dataContainer.add("Привет");
        int index2 = dataContainer.add("Как дела");
        int index3 = dataContainer.add("Работаю");
        int index4 = dataContainer.add("Артем");
        int index5 = dataContainer.add("Дизоксирибонуклииновая кислота");
        int index6 = dataContainer.add("Приветы");
        int index7 = dataContainer.add("Vladislav");
        int index8 = dataContainer.add("Привет");

        String text1 = dataContainer.get(index1);
        String text2 = dataContainer.get(index2);
        String text3 = dataContainer.get(index3);
        String text4 = dataContainer.get(index4);
        String text5 = dataContainer.get(index5);
        String text6 = dataContainer.get(index4);
        String text7 = dataContainer.get(index4);

        System.out.println(text1 + " - значение 1");
        System.out.println(text2 + " - значение 2");
        System.out.println(text3 + " - значение 3");
        System.out.println(text4 + " - значение 4");

        System.out.println();

        dataContainer.delete(1);
        dataContainer.delete(text1);


        System.out.println(Arrays.toString(dataContainer.getItems()) + " - массив значений из списка");
        System.out.println(dataContainer.get(index1));

        dataContainer.sort(new StringComparatorByLength());
        System.out.println(dataContainer + " - список отсортирован по длинне");

        dataContainer.sort(new StringComparatorByAlphabet());
        System.out.println(dataContainer + " - список отсортирован по алфавиту");


        System.out.println();
        System.out.println("Тест итератора");

        for (String string : dataContainer) {
            System.out.print(string + "  ");
        }

        System.out.println();
        System.out.println("Тест ститического сортровщика");

        DataContainer<String> dataString =  new DataContainer<>(String.class);

        dataString.add("sda");
        dataString.add("sadaf");
        dataString.add("ffa");
        dataString.add("fasfafaf");

        System.out.println(dataString + " - без сортировки");

        DataContainer.sort(dataString, new StringComparatorByLength());

        System.out.println(dataString + " - сортировка по длинне строки");

        DataContainer.sort(dataString);

        System.out.println(dataString + " - базовая сортировка");
    }



}