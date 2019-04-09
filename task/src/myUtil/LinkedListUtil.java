package myUtil;

public class LinkedListUtil {


    public static ListNode createLinkedList(int[] nums){
        if(null == nums || nums.length == 0){
            return null;
        }
        else{
            ListNode head = new ListNode(nums[0]);
            ListNode start = head;
            for(int i =1;i<nums.length;i++){
                ListNode insert = new ListNode(nums[i]);
                start.next = insert;
                start = start.next;
            }

            return head;
        }
    }


    public static void printLinkedList(ListNode head){
        while(head !=null ){
            System.out.print(head.val);
            System.out.print(" -> ");
            head = head.next;
        }
        System.out.println("Null");
    }
}
