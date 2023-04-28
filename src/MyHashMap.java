import java.util.Arrays;

public class MyHashMap {
    private static final int DEFAULT_CAPACITY = 10;
    private final Node[] table;
    private int size;

    private static class Node {
        final Object key;
        Object value;
        Node next;

        Node(Object key, Object value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Object getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }

    public MyHashMap() {
        table = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyHashMap(int initialCapacity) {
        table = new Node[initialCapacity];
        size = 0;
    }

    private int hash(Object key) {
        return Math.abs(key.hashCode() % table.length);
    }

    public void put(Object key, Object value) {
        int bucketIndex = hash(key);
        Node node = table[bucketIndex];
        while (node != null) {
            if (node.key.equals(key)) {
                node.setValue(value);
                return;
            }
            node = node.next;
        }
        Node newNode = new Node(key, value, table[bucketIndex]);
        table[bucketIndex] = newNode;
        size++;
    }

    public Object get(Object key) {
        int bucketIndex = hash(key);
        Node node = table[bucketIndex];
        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    public void remove(Object key) {
        int bucketIndex = hash(key);
        Node node = table[bucketIndex];
        Node prevNode = null;
        while (node != null) {
            if (node.key.equals(key)) {
                if (prevNode == null) {
                    table[bucketIndex] = node.next;
                } else {
                    prevNode.next = node.next;
                }
                size--;
                return;
            }
            prevNode = node;
            node = node.next;
        }
    }

    public void clear() {
        Arrays.fill(table, null);
        size = 0;
    }

    public int size() {
        return size;
    }
}
