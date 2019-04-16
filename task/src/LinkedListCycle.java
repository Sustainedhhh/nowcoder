import myUtil.*;

public class LinkedListCycleI {

    public static void main(String[] args) {
        int[] nums = {3,2,0,-4};
        ListNode res = LinkedListUtil.createCycleLinkedList(nums,1);
        System.out.println(hasCycle(res));
    }

    public static boolean hasCycle(ListNode head) {
        if (null == head){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (null != fast && null != fast.next){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }

}
