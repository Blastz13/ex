package q15SplitStack;

import java.util.Stack;

public class Main
{
    public static void main(String[] args) {
        splitStack splitStack = new splitStack();
        Stack<Integer> stack = new Stack<>();
        stack.add(2);
        stack.add(-1000);
        stack.add(0);
        stack.add(-1);
        stack.add(2);
        stack.add(3);

        System.out.println(splitStack.splitStackkkkk(stack));

    }
}
