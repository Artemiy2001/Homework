package home_work_4.list;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class DataContainer<T> implements ArtemList<T> {

    private T[] data;
    private int size;

    public DataContainer(Class<T> clazz) {
        data = (T[]) Array.newInstance(clazz, size);
    }

    public DataContainer(Class<T> clazz, int size) {
        this.size = size;
        data = (T[]) Array.newInstance(clazz, size);
    }

    @Override
    public T[] data() {
        return data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int add(T item){
        if (item == null){
            return -1;
        }
        if (size <= data.length){
            data = grow(size);
        }
        data[size] = item;

        return size++;
    }

    @Override
    public T get(int index){
        if (index > size && index < 0){
            return null;
        }
        return data[index];
    }

    @Override
    public T[] getItems() {
        return Arrays.copyOf(data, size);
    }

    @Override
    public boolean delete(int index){
        if (index < 0 || index > size){
            return false;
        }else {
            removeItem(data, index);
            return true;
        }
    }

    @Override
    public boolean delete(T item) {
        if (item == null){
            return false;
        }
        int i = 0;
        int index = 0;
        boolean foundItem = false;
        for (;i < size;i++){
            if (data[i].equals(item)){
                index = i;
                foundItem = true;
                break;
            }
        }
        if (!foundItem){
            return false;
        }else {
            removeItem(data, index);
            return true;
        }
    }

    @Override
    public void sort(Comparator<? super T> c){
        for (int i = 1; i < size; i++){
            for (int j = i; j > 0; j--){
                if(c.compare(data[j-1], data[j]) > 0){
                    swap(data, j - 1, j);
                }else {
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder dataString = new StringBuilder();
        dataString.append("[");

        for (int i = 0; i < size; i++){
            if (i == size - 1){
                dataString.append(data[i]);
            }else {
                dataString.append(data[i]).append(", ");
            }
        }
        dataString.append("]");
        return String.valueOf(dataString);
    }

    public static <T extends Comparable> void sort(ArtemList<T> dataContainer){
        for (int i = 1; i < dataContainer.size(); i++){
            for (int j = i; j > 0; j--){
                if (dataContainer.data()[j - 1].compareTo(dataContainer.data()[j]) > 0){
                    dataContainer.swap(dataContainer.data(), j - 1, j);
                }else {
                    break;
                }
            }
        }
    }

    public static <T> void sort(ArtemList<T> dataContainer, Comparator<? super T> c){
        for (int i = 1; i < dataContainer.size(); i++){
            for (int j = i; j > 0; j--){
                if(c.compare(dataContainer.data()[j-1], dataContainer.data()[j]) > 0){
                    dataContainer.swap(dataContainer.data(), j - 1, j);
                }else {
                    break;
                }
            }
        }
    }


    private T[] grow(int size){
        return Arrays.copyOf(data, size + 5);
    }


    private void removeItem(T[] data, int index){
        int newSize = size - 1;
        System.arraycopy(data, index + 1, data, index, newSize - index);
        data[size = newSize] = null;
    }

    public void swap(T[] arr, int a, int b) {
        T object = arr[a];
        arr[a] = arr[b];
        arr[b] = object;
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }


    private class Itr implements Iterator<T> {

        int cursor;

        Itr() {}

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public T next() {
            return data[cursor++];
        }

    }

}




