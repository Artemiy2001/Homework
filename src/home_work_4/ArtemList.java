package home_work_4;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

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
