class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) { this.val = val; }
}

public class CM11 {
    public ListNode partition(ListNode pHead, int x) {
        if (pHead == null) return null;
        ListNode smallHead = new ListNode(0), smallTail = smallHead;
        ListNode largeHead = new ListNode(0), largeTail = largeHead;
        ListNode cur = pHead;
        while (cur != null) {
            if (cur.val < x) {
                smallTail.next = cur;
                smallTail = cur;
            } else {
                largeTail.next = cur;
                largeTail = cur;
            }
            cur = cur.next;
        }
        smallTail.next = largeHead.next;
        largeTail.next = null;
        return smallHead.next;
    }

    public static void main(String[] args) {
        // 测试：3 -> 1 -> 2 -> 4, x = 2，期望 1 -> 3 -> 2 -> 4
        ListNode head = new ListNode(3);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(4);

        CM11 obj = new CM11();
        ListNode result = obj.partition(head, 2);

        // 打印结果
        while (result != null) {
            System.out.print(result.val + (result.next != null ? " -> " : ""));
            result = result.next;
        }
    }
}