public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("abc");
        list.add("abb");
        list.add("aba");
        System.out.println("Size: " + list.size());
        System.out.println("Element #2: " + list.get(2));
        list.remove(2);
        System.out.println("Size after remove: " + list.size());
        list.clear();
        System.out.println("Size after clear: " + list.size());
    }
}
