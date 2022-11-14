package ss9_ArrayList_LinkList.thucHanh;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPCACIY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPCACIY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ",Size " + i);
        }
        return (E) elements[i];
    }
}
