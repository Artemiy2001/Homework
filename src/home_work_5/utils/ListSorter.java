package home_work_5.utils;

import home_work_5.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ListSorter<E> {

    public void listSort(List<E> list, Comparator<? super E> c){
        boolean isChange = true;
        while (isChange){
            isChange = false;
            for (int i = 0; i < list.size() - 1; i++){
                if (c.compare(list.get(i), list.get(i + 1)) > 0 ){
                    isChange = true;
                    Collections.swap(list, i, i+ 1);
                }
            }
        }

    }
}
