import myutil.*;

/**
 * DESCRIPTION
 * 反转链表
 * @author: zwl
 */
public class ReverseLinkedList206 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        ListNode head = LinkedListUtil.createLinkedList(nums);
        LinkedListUtil.printLinkedList(head);
        LinkedListUtil.printLinkedList(reverseList(head));
    }

    /**
     * 遍历的方式反转链表  注意链表中的多指针使用，可以多用几个指针去持有需要的内容
     * @param head
     * @return
     */
    /*    public static ListNode reverseList(ListNode head) {
            ListNode pre = null;
            ListNode cur = head;
            ListNode next;
            while (cur != null) {
                next = cur.next;
                cur.next = pre ;
                pre = cur ;
                cur = next;
            }
            return pre;


        }*/



    /**
     *  递归的方式去反转链表
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        return reverseNode(null,head);
    }

    /**
     * 递归主要是代码量少，利用了方法栈来保存变量
     * @param pre 前驱节点
     * @param cur
     * @return
     */
    public static ListNode reverseNode(ListNode pre, ListNode cur) {
        if (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            return reverseNode(cur,next);
        } else {
            return pre;
        }

    }

}
