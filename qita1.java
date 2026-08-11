import java.util.*;
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class qita1 {
    public ListNode FindKthToTail(ListNode head,int k) {

        ListNode count = head;
        int size = 0;
        for (; count != null; count = count.next) {
            size++;
        }
        if (k > size) {
            return null;
        }
        ListNode target = head;
        for (;size > k; size--) {
            target = target.next;
        }
        return target;
    }
}
