
import myUtil.*;

public class ReverseLinkedListII92 {
    public static void main(String[] args) {
        int[] nums = {3,5};
        ListNode head = LinkedListUtil.createLinkedList(nums);
        ReverseLinkedListII92 demo = new ReverseLinkedListII92();
        ListNode res = demo.reverseBetween(head,1,2);
        LinkedListUtil.printLinkedList(res);

    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if(null != head){
            ListNode cur = head;
            ListNode pre = null;
            while(m > 1){
                pre = cur;
                cur = cur.next;
                m--;
                n--;
            }

            ListNode tail = cur;
            ListNode  con = pre;

            pre =null;
            ListNode next;
            while(n > 0){
                    next = cur.next;
                    cur.next = pre;
                    pre = cur;
                    cur = next;
                    n--;
            }
            if(null != con){
                con.next = pre;
            }
            else{
                head = pre;
            }
                tail.next = cur;
        }
        return head;
    }



// leetcode 讲解
//    private boolean stop;
//    private ListNode left;
//
//    public void recurseAndReverse(ListNode right, int m, int n) {
//
//        // base case. Don't proceed any further
//        if (n == 1) {
//            return;
//        }
//
//        // Keep moving the right pointer one step forward until (n == 1)
//        right = right.next;
//
//        // Keep moving left pointer to the right until we reach the proper node
//        // from where the reversal is to start.
//        if (m > 1) {
//            this.left = this.left.next;
//        }
//
//        // Recurse with m and n reduced.
//        this.recurseAndReverse(right, m - 1, n - 1);
//
//        // In case both the pointers cross each other or become equal, we
//        // stop i.e. don't swap data any further. We are done reversing at this
//        // point.
//        if (this.left == right || right.next == this.left) {
//            this.stop = true;
//        }
//
//        // Until the boolean stop is false, swap data between the two pointers
//        if (!this.stop) {
//            int t = this.left.val;
//            this.left.val = right.val;
//            right.val = t;
//
//            // Move left one step to the right.
//            // The right pointer moves one step back via backtracking.
//            this.left = this.left.next;
//        }
//    }
//
//    public ListNode reverseBetween(ListNode head, int m, int n) {
//        this.left = head;
//        this.stop = false;
//        this.recurseAndReverse(head, m, n);
//        return head;
//    }

//    private ListNode left;
//    private boolean flag;
//    public ListNode reverseBetween(ListNode head, int m, int n) {
//        this.left = head;
//        this.flag = true;
//        recurseAndReverse(head,m,n);
//        return head;
//    }
//
//    public void recurseAndReverse(ListNode right,int m,int n){
//        //right用来存储每一步中右端的指针值，回退的关键
//        if(n == 1){
//            return;
//        }
//        else{
//            right=right.next;
//        }
//
//        if(m>1){
//            this.left = this.left.next;
//        }
//
//        recurseAndReverse(right,m-1,n-1);
//
//        if(this.left == right || right.next == this.left ){
//            this.flag = false;
//        }
//
//        if(this.flag != false){
//            int temp = this.left.val;
//            this.left.val = right.val;
//            right.val = temp;
//            this.left = this.left.next;
//        }
//
//    }
}
