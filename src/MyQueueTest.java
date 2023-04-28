public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.add("one");
        queue.add("two");
        queue.add("three");

        System.out.println("Size of queue: " + queue.size());
        System.out.println("First element in queue: " + queue.peek());

        while (queue.size() > 0) {
            System.out.println("Removed element from queue: " + queue.poll());
        }

        queue.add("four");
        queue.add("five");
        queue.clear();

        System.out.println("Size after clear: " + queue.size());
    }
}
