package q29StackArray;

public class AStack<T> {
    T[] arr = (T[]) new Object[5];
    Integer top = 0;

    public void add(T el){
        if (arr.length < top){
            arr = (T[]) new Object[arr.length * 2];
        }
        arr[top] = el;
        top++;
    }

    public void pop(){
        if (top < 0){
            System.out.println("EMPTY");
        }else{
            arr[top] = null;
            top--;
        }
    }

    public void peek(){
        if (top-1 >= 0){
            System.out.println(arr[top-1]);
        }
    }
}
