package home_work_5.utils;

import home_work_5.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ListSorter<E> {

    public void bubbleListSort(List<E> list, Comparator<? super E> c){
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

    public void selectionSortList(List<E> list, Comparator<? super E> c){
        int minValueIndex;
        for (int i = 0; i < list.size(); i++){
            minValueIndex = i;
            for (int j = i; j < list.size(); j++){
                if (c.compare(list.get(minValueIndex), list.get(j)) > 0){
                    minValueIndex = j;
                }
            }
            if (i != minValueIndex){
                Collections.swap(list, i, minValueIndex);
            }
        }
    }

    public void quickSort(List<E> list, Comparator<? super E> c){
        int pivot = list.size() - 1;
        int wall = 0;


        sort(list, pivot, wall, c);




    }

    private void sort(List<E> list, int right, int left, Comparator<? super E> c){

        if (left >= right){
            return;
        }
        int pivot = right;
        int wall = left;


        for (int i = wall; i < right; i++){
            if(c.compare(list.get(i),list.get(pivot)) < 0){

                Collections.swap(list, i, wall);
                wall++;

            }
        }
        Collections.swap(list, wall, pivot);



        sort(list, pivot, wall + 1, c);
        sort(list, wall - 1, left, c);
    }
}
