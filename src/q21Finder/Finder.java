package q21Finder;

public class Finder{
    public static int find(Comparable[] a, int el){
        for(int i=0; i<a.length; i++){
            if( a[i].compareTo(el) == 0){
                return i;
            }
        }
        return -1;
    }
}
