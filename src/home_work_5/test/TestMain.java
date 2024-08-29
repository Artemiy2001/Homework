package home_work_5.test;

import home_work_5.utils.ListSorter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class TestMain {

    public static void main(String[] args) {

        List<Integer> integerList1 = new ArrayList<>();
        List<Integer> integerList2 = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10_000; i++){
            integerList1.add(random.nextInt(1000));
        }
        for (int i = 0; i < 1_000_000; i++){
            integerList2.add(random.nextInt(1000));
        }

        ListSorter<Integer> listSorter = new ListSorter<>();

        long t1 = System.currentTimeMillis();
        listSorter.bubbleListSort(integerList1, Integer::compare);
        System.out.println(System.currentTimeMillis() - t1);


        long t2 = System.currentTimeMillis();
        listSorter.quickSort(integerList2, Integer::compare);
        System.out.println(System.currentTimeMillis() - t2);

    }
}
