package home_work_4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.function.Consumer;

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
        if (index > size){
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


    private T[] grow(int size){
        return Arrays.copyOf(data, size + 5);
    }


    private void removeItem(T[] data, int index){
        int newSize = size - 1;
        System.arraycopy(data, index + 1, data, index, newSize - index);
        data[size = newSize] = null;
    }

    private void swap(T[] arr, int a, int b) {
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




