package q29StackArray;

public class Main
{
    public static void main(String[] args) {
        AStack<Integer> stack = new AStack<Integer>();
        stack.add(1);
        stack.peek();
        stack.add(2);
        stack.peek();
        stack.add(3);
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();

    }
}
