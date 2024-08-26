package home_work_4.list;

import java.util.Iterator;

public interface ArtemList<T> extends Iterable<T>{

    T[] data();

    int size();

    int add(T item);

    void swap(T[] arr, int a, int b);

    T get(int index);

    T[] getItems();

    boolean delete(int index);

    boolean delete(T item);

    void sort(Comparator<? super T> comparator);


    @Override
    Iterator<T> iterator();

}
