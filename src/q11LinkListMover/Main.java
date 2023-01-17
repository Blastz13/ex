package q11LinkListMover;

public class Main
{
    public static void main(String[] args) {
        LinkedIntList linkedIntList = new LinkedIntList(1);
        linkedIntList.add(2);
        linkedIntList.add(3);
        linkedIntList.print();
        linkedIntList.move();
        linkedIntList.print();
    }
}
