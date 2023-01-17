package q2MapReverse;

import java.util.HashMap;
import java.util.Map;

public class RMap {
    public Map<String, Integer> reverse(Map<Integer, String> map){
        Map<String, Integer> nmap = new HashMap();
        for (Integer key : map.keySet()){
            nmap.put(map.get(key), key);
        }
        return nmap;
    }
}
