package q4SetOdd;

import java.util.HashSet;
import java.util.Set;

public class Main
{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(3);
        NSet nSet = new NSet();
        System.out.println(nSet.hasOdd(set));

    }
}
