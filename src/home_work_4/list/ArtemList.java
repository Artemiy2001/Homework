package home_work_4.list;

import java.util.Iterator;

public interface ArtemList<T> extends Iterable<T>{

    int add(T item);

    T get(int index);

    T[] getItems();

    boolean delete(int index);

    boolean delete(T item);

    void sort(Comparator<? super T> comparator);


    @Override
    Iterator<T> iterator();

}
