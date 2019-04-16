package myUtil;

public class LinkedListUtil {


    public static ListNode createLinkedList(int[] nums){
        if(null == nums || nums.length == 0){
            return null;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode cur = head;
        for (int index=1;index<nums.length;index++){
            ListNode insert = new ListNode(nums[index]);
            cur.next = insert;
            cur = cur.next;
        }
        return head;
    }

    public static void printLinkedList(ListNode head){

        while(head != null){
            System.out.print(head.val);
            System.out.print(" -> ");
            head = head.next;
        }
        System.out.println("NULL");

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        ListNode head = createLinkedList(nums);
        printLinkedList(head);

    }

}




