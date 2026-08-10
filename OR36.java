import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class OR36 {
    public boolean chkPalindrome(ListNode A) {
        int[] arr = new int[950];
        ListNode t = A;
        int count = 0;

        for (; t != null; t = t.next) {
            arr[count] = t.val;
            count++;
        }

        int left = 0;

        while (left < count) {
            if (arr[left] != arr[count - 1]) {
                return false;
            }
            left++;
            count--;
        }
        return true;
    }
}