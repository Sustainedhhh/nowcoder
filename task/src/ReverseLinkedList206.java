import myutil.*;

/**
 * DESCRIPTION
 * 反转链表
 * @author: zwl
 */
public class ReverseLinkedList206 {




//        public static ListNode reverseList(ListNode head) {
//            ListNode pre = null;
//            ListNode cur = head;
//            ListNode next;
//            while(cur != null){
//                next = cur.next;
//                cur.next = pre ;
//                pre = cur ;
//                cur = next;
//            }
//
//            return pre;
//
//
//        }
        public static ListNode reverseList(ListNode head) {
            return reverseNode(null,head);
        }

        public static ListNode reverseNode(ListNode pre,ListNode cur){
            if(cur != null){
                ListNode next = cur.next;
                cur.next = pre;
                return reverseNode(cur,next);
            }
            else{
                return pre;
            }

        }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        ListNode head = LinkedListUtil.createLinkedList(nums);
        LinkedListUtil.printLinkedList(head);
        LinkedListUtil.printLinkedList(reverseList(head));
    }



}
