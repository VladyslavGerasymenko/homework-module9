public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put("key#1", "value1");
        map.put("key#2", "value2");
        System.out.println(map.get("key#1"));
        System.out.println(map.size());
        map.remove("key#2");
        System.out.println(map.size());
        map.clear();
        System.out.println(map.size());

    }
}
