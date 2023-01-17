package q14equalStacks;
import java.util.Stack;

public class Main
{
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.add(-1);
        stack2.add(-1);
        stack1.add(1);
        stack2.add(1);
        stack1.add(2);
        stack2.add(2);

        System.out.println(equalStack(stack1, stack2));
        System.out.println(stack1);
        System.out.println(stack2);
    }

    public static boolean equalStack(Stack<Integer> stack1, Stack<Integer> stack2){
        Stack<Integer> tmpStack = new Stack<>();

        for (int i=0; i<stack1.size(); i++) {
            if (stack1.get(i).intValue() != stack2.get(i).intValue()){
                return false;
            }
        }

        return true;
    }
}
