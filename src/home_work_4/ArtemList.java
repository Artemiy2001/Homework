package home_work_4;

public interface ArtemList<T> {

    int add(T item);

    T get(int index);

    T[] getItems();

    boolean delete(int index);

    boolean delete(T item);


}
