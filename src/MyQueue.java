import java.util.NoSuchElementException;

public class MyQueue {
    private Object[] array;
    private int size;
    private int head;
    private int tail;

    public MyQueue() {
        array = new Object[8];
        size = 0;
        head = 0;
        tail = 0;
    }

    public void add(Object value) {
        if (size == array.length) {
            resize();
        }
        array[tail++] = value;
        size++;
        if (tail == array.length) {
            tail = 0;
        }
    }

    private void resize() {
        Object[] newArray = new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
        if (head > tail) {
            System.arraycopy(array, head, array, head + array.length / 2, array.length / 2);
            head += array.length / 2;
        }
    }

    public void clear() {
        array = new Object[10];
        size = 0;
        head = 0;
        tail = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (size == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        return array[head];
    }

    public Object poll() {
        if (size == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        Object value = array[head];
        array[head++] = null;
        size--;
        if (head == array.length) {
            head = 0;
        }
        return value;
    }
}
