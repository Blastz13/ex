package q25stackArrayList;

import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> list;
    private int size;

    public int getSize() {
        return size;
    }

    public Stack() {
        this.list = new ArrayList<>();
        this.size = 0;

    }

    public void push(T a) {
        list.add(size, a);
        size++;

    }

    public T pop() {
        if (size == 0) {
            return null;
        }
        T a = list.get(size - 1);
        list.remove(size-1);
        size --;

        return a;
    }

}