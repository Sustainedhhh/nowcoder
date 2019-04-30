import myutil.*;

/**
 * DESCRIPTION
 * leetcode题目
 *  fixme 没看题目 感觉有一些问题； 回头补上
 * @author: zwl
 */
public class PartitionList86 {

    public static void main(String[] args) {

        int[] nums = {1,4,3,2,5,1};
        ListNode head =LinkedListUtil.createLinkedList(nums);
        LinkedListUtil.printLinkedList(partition(head,3));
    }


    public static ListNode partition(ListNode head, int x) {
        if(null == head){
            return head;
        }

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        while(null != dummyHead.next && dummyHead.next.val < x ){
            dummyHead = dummyHead.next;
        }
        ListNode pre = dummyHead;
        ListNode cur = dummyHead.next;
        while(cur != null){
            if(cur.val < x ){
                pre.next = cur.next;
                ListNode next = dummyHead.next;
                dummyHead.next = cur;
                cur.next = next;
                dummyHead = dummyHead.next;
                cur = pre.next;
            }
            else{
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}

