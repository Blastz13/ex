package q18ArrayIntListSuequnce;

public class ArrayIntList {
    private int[] elementData;
    private int size;

    public ArrayIntList(int size){
        this.size = size;
        elementData = new int[size];
        for (int i = 0; i < size; i++) {
            elementData[i] = i;
        }
    }

    public int longestSortedSequence(){
        if (size == 0){
            return 0;
        }

        int count = 0;
        int maxcount = 0;
        for (int i = 0; i < size-1; i++) {
            if (elementData[i] <= elementData[i+1]){
                count++;
            }else {
                count = 0;
            }
            if (maxcount < count){
                maxcount = count;
            }
        }

        return ++maxcount;
    }


}
