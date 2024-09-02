package home_work_5.utils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        int right = list.size() - 1;
        int left = 0;

        sort(list, left, right, c);

    }

    private void sort(List<E> list, int left, int right, Comparator<? super E> c){

        if (left >= right){
            return;
        }

        int lt = left;
        int gt = right;
        int i = left;

        E pivot = list.get(right);

        while (i <= gt){
            if (c.compare(list.get(i), pivot) < 0){
                Collections.swap(list, lt++, i++);
            } else if (c.compare(list.get(i), pivot) > 0) {
                Collections.swap(list, i, gt--);
            }else {
                i++;
            }
        }

        sort(list, left, lt - 1, c);
        sort(list,gt + 1, right, c);

    }


}
