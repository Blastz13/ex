package q2MapReverse;

import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args) {
        RMap rMap = new RMap();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "222");
        map.put(2, "222");
        map.put(3, "3333");
        Map<String, Integer> m = rMap.reverse(map);
        System.out.println(m);
    }
}
