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
        int index6 = dataContainer.add("Привет");
        int index7 = dataContainer.add("Vladislav");
        String text1 = dataContainer.get(index1);
        String text2 = dataContainer.get(index2);
        String text3 = dataContainer.get(index3);
        String text4 = dataContainer.get(index4);
        String text5 = dataContainer.get(index4);
        String text6 = dataContainer.get(index4);
        String text7 = dataContainer.get(index4);
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);
        dataContainer.delete(1);
        dataContainer.delete(text1);
        System.out.println(Arrays.toString(dataContainer.getItems()));
        System.out.println(dataContainer.get(index1));
        dataContainer.sort(new StringComparatorByLength());
        System.out.println(dataContainer);
        dataContainer.sort(new StringComparatorByAlphabet());
        System.out.println(dataContainer);


        for (String string : dataContainer) {
            System.out.print(string + " - ");
        }

    }


}
