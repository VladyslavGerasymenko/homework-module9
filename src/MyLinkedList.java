public class MyLinkedList {
    private Node first;
    private Node last;
    private int size;

    public MyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    public void add(Object value) {
        Node newNode = new Node(value);
        if (size == 0) {
            first = newNode;
        } else {
            newNode.setPrevious(last);
            last.setNext(newNode);
        }
        last = newNode;
        size++;
    }

    public void remove(int index) {
        Node nodeToRemove = getNode(index);
        Node previousNode = nodeToRemove.getPrevious();
        Node nextNode = nodeToRemove.getNext();
        if (previousNode == null) {
            first = nextNode;
        } else {
            previousNode.setNext(nextNode);
        }
        if (nextNode == null) {
            last = previousNode;
        } else {
            nextNode.setPrevious(previousNode);
        }
        size--;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.getValue();
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node node;
        if (index < size / 2) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.getNext();
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.getPrevious();
            }
        }
        return node;
    }

    private static class Node {
        private final Object value;
        private Node previous;
        private Node next;

        public Node(Object value) {
            this.value = value;
            previous = null;
            next = null;
        }

        public Object getValue() {
            return value;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
