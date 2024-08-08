package home_work_4;

import java.util.Arrays;

public class DataContainer<T> implements ArtemList<T> {

    private T[] data;
    private int size;

    public DataContainer(T[] data) {
        this.data = data;
    }


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

    public T get(int index){
        if (index > size){
            return null;
        }
        return data[index];
    }

    public T[] getItems(){
        return data;
    }

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


    private T[] grow(int size){
        return Arrays.copyOf(data, size + 5);
    }

    private void removeItem(T[] data, int index){
        int newSize = size - 1;
        System.arraycopy(data, index + 1, data, index, newSize - index);
        data[size = newSize] = null;
    }

    @Override
    public String toString() {
        StringBuffer dataString = new StringBuffer();
        dataString.append("[");

        for (int i = 0; i < size; i++){
            if (i == size - 1){
                dataString.append(data[i]);
            }else {
                dataString.append(data[i] + ", ");
            }
        }
        dataString.append("]");
        return String.valueOf(dataString);
    }
}
