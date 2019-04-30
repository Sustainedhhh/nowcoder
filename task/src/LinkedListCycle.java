import myutil.*;

/**
 * DESCRIPTION
 *  关于单链表上有环的题目
 *  判断是否有环； 求环的入口；
 *  （判断两个相交的链表的第一个交叉点，连接任一一条链表的头尾，则问题转换为求环的入口点）
 * @author: zwl
 */
public class LinkedListCycle {

    public static void main(String[] args) {
        int[] nums = {3,2,0,-4};
        ListNode res = LinkedListUtil.createCycleLinkedList(nums,1);
        System.out.println(hasCycle(res));
    }

    /**
     * 判断一个单链表是否有环(快慢指针法)
     * @param head 待判断单链表
     * @return true/false
     */
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

    /**
     * 判断链表是否有环，并返回环的进入点；快慢指针法
     * x: 环的进入点与快慢指针相遇点的距离
     * a: 链表起点到环进入点的距离
     * r: 环的长度
     * 2 slow = fast -> 2(a + x) = a + x + n*r -> a + x = (n-1) * r + r -> a = (n - 1) * r + (r - x);
     * @param head
     * @return
     */
    public static ListNode linkedListCycleStart(ListNode head){
        ListNode res = hasCycleNode(head);
        if (null != res){
            while (head != res) {
                head = head.next;
                res = res.next;
            }
        }
        return res;
    }

    /**
     * 配合求环的进入点
     * @param head
     * @return 快慢指针相遇点
     */
    public static ListNode hasCycleNode(ListNode head){
        if (null == head){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (null != fast && null != fast.next){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return slow;
            }
        }
        return null;
    }

}
