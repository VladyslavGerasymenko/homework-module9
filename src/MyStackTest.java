public class MyStackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.remove(1);
        System.out.println(stack.peek());
        stack.clear();
        System.out.println(stack.size());

    }
}
