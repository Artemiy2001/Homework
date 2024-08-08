package home_work_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataContainerDemo {

    public static void main(String[] args) {

        DataContainer<String> dataContainer = new DataContainer<>(new String[5]);



        int a = dataContainer.add("Artem");
        int b = dataContainer.add("Maxim");
        int c = dataContainer.add("Vasiliy");
        dataContainer.add("Vladislav");
        dataContainer.add("Pavel");

        String str = dataContainer.get(1);



        String[] arrStr = dataContainer.getItems();

        System.out.println(Arrays.toString(arrStr));

        System.out.println(dataContainer.delete(2));
        System.out.println(dataContainer.delete("Pavel"));
        dataContainer.delete("Artem");
        dataContainer.delete("Maxim");
        dataContainer.delete(null);

        System.out.println(str);

        System.out.println(a + " " + b + " " + c);

        System.out.println(dataContainer);

    }
}
