import myutil.ListNode;

public class KGroupReverse25 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        ListNode head = myutil.LinkedListUtil.createLinkedList(nums);
        ListNode res = reverseKGroup(head,2);
        myutil.LinkedListUtil.printLinkedList(res);
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (null == head || null == head.next) {
            return head;
        }

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode res = dummyHead;

        ListNode pre = null;
        ListNode cur = dummyHead.next;
        ListNode tail;
        int nums;
        while (null != cur) {
            nums = k - 1 ;
            tail = cur;
            while (nums != 0 && null != tail) {
                nums--;
                tail = tail.next;
            }
            if (null == tail) {
                return dummyHead.next;
            } else {
                ListNode next;
                ListNode start = cur;
                nums = k;
                while (nums != 0) {
                    nums--;
                    next = cur.next;
                    cur.next = pre;
                    pre = cur;
                    cur = next;
                }
                res.next = pre;
                start.next = cur;

                pre = start;
                res = start;
            }

        }
        return dummyHead.next;
    }


}
