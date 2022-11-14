package ss9_ArrayList_LinkList.baiTap;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(E element) {
        ensureCapacity();
        for (int i = 0; i < size; i++) {
            if (elements[i] == null) {
                elements[i] = element;
                size++;
                break;
            }
        }
    }

    public void add(int index, E element) {
        ensureCapacity();
        if (elements[index] != null) {
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        } else System.out.println("Phần tử trong mảng ở vị trí " + index + " rỗng");
    }

    public E remove(int index) {
        if (elements[index] != null) {
            E tempElement = (E) elements[index];
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;
            size--;
            return tempElement;
        } else throw new IndexOutOfBoundsException("No element existence!!!");
    }

    public int size() {
        return size;
    }

    public void ensureCapacity() {
        int minCapacity = elements.length * 2;
        if (elements.length == this.size) {
            Object[] tempElement = new Object[minCapacity];
            for (int i = 0; i < size; i++) {
                tempElement[i] = elements[i];
            }
            elements = tempElement;
        }
    }

    public Object clone() {
        Object[] tempElements = new Object[elements.length];
        for (int i = 0; i < size; i++) {
            tempElements[i] = elements[i];
        }
        return tempElements;
    }

    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(E element) {
        for (int i = size - 1; i >= 0; i--) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public E get(int index) throws Exception {
        if (elements[index] != null) {
            return (E) elements[index];
        } else throw new Exception("Index null dồi bạn ôi, ối dồi ôi");
    }

    public void clear() {
        while (this.size != 0) {
            elements[size - 1] = null;
            this.size--;
        }
    }

    public void printout() {
        if (size != 0) {
            System.out.print("The list is: ");
            for (int i = 0; i < size; i++) {
                System.out.print(elements[i] + "\t");
            }
        } else System.out.println("The list is empty");
    }
}

