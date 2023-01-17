package q4SetOdd;

import java.util.Iterator;
import java.util.Set;

public class NSet {

    public boolean hasOdd(Set<Integer> set) {
        Iterator a = set.iterator();
        while (a.hasNext()){
            Integer val = (Integer) a.next();
            if (val % 2 == 1){
                return true;
            }
        }
            return false;
    }
}
