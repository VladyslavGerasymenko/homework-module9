public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("one");
        list.add("two");
        list.add("three");

        System.out.println("Size: " + list.size());

        System.out.println("Elements in list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(1);

        System.out.println("Size after remove element: " + list.size());

        System.out.println("Elements remove element:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.clear();

        System.out.println("Size after clear: " + list.size());
    }
}
