package q15SplitStack;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class splitStack {
    public Stack<Integer> splitStackkkkk(Stack<Integer> stack){
        Stack<Integer> stn = new Stack<>();
        Queue<Integer> tempqueue = new ArrayDeque<>();

        while (stack.isEmpty() != true){
            Integer tempint = stack.pop();
            if (tempint >= 0){
                tempqueue.add(tempint);
            }
            else {
                stn.add(tempint);
            }
        }

        for (Integer i : tempqueue) {
            stn.add(i);
        }

        return stn;
    }
}
