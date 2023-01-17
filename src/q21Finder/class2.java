package q21Finder;

public class class2 implements Comparable{
    public int b = 1;
    @Override
    public int compareTo(Object o) {
        if (b == (Integer) o){
            return 0;
        }
        return 1;
    }

}
