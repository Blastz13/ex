package q21Finder;

public class class1 implements Comparable{
    public int a = 0;

    @Override
    public int compareTo(Object o) {
        if (a == (Integer) o){
            return 0;
        }
        return 1;
    }
}
