package q11LinkListMover;

public class LinkedIntList {
    ListNode head = new ListNode(1);

    public LinkedIntList(Integer val) {
        ListNode head = new ListNode(val);
    }

    public void add(Integer val){
        ListNode tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }

        ListNode ntmp = new ListNode(val);
        tmp.next = ntmp;
    }

    public void print(){
        ListNode tmp = head;
        System.out.println(tmp.data);
        while (tmp.next != null){
            tmp = tmp.next;
            System.out.println(tmp.data);
        }
    }

    public void move(){
        ListNode tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        Integer tmph = head.data;
        head = head.next;
//        head.next = null;
        tmp.next = new ListNode(tmph);
    }
}
