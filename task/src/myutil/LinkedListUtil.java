package myutil;

/**
 * DESCRIPTION
 * 链表工具类
 *
 * @author: zwl
 */
public class LinkedListUtil {

    /**
     * 从数组创建一个单链表
     * @param nums
     * @return 单链表的头
     */
    public static ListNode createLinkedList(int[] nums) {
        if (null == nums || nums.length == 0) {
            return null;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode cur = head;
        for (int index=1;index<nums.length;index++) {
            ListNode insert = new ListNode(nums[index]);
            cur.next = insert;
            cur = cur.next;
        }
        return head;
    }

    /**
     *  从数组创建一个循环链表
     * @param nums 节点值
     * @param pos 循坏开始位置
     * @return 链表的头
     */
    public static ListNode createCycleLinkedList(int[] nums,int pos) {
        if (null == nums || nums.length == 0) {
            return null;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode cur = head;
        ListNode cycle = null;
        if (pos == 0) {
            cycle = head;
        }

        for (int index=1;index<nums.length;index++) {
            ListNode insert = new ListNode(nums[index]);
            if (pos == index) {
                cycle = insert;
            }
            cur.next = insert;
            cur = cur.next;
        }
        cur.next = cycle;
        return head;
    }

    /**
     * 打印链表
     * @param head
     */
    public static void printLinkedList(ListNode head) {
        while (head != null) {
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




