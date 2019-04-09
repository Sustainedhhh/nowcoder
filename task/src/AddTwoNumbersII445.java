import myUtil.*;


public class AddTwoNumbersII445 {
    private int addition;
    private ListNode dummyRes;
    private ListNode res;

    public static void main(String[] args) {
        AddTwoNumbersII445 demo = new AddTwoNumbersII445();
        int[] nums1 = {0};
        int[] nums2 = {7,3};

        ListNode l1 = LinkedListUtil.createLinkedList(nums1);
        ListNode l2 = LinkedListUtil.createLinkedList(nums2);

        LinkedListUtil.printLinkedList(demo.addTwoNumbers(l1, l2));

    }
    //采用迭代的方案解决问题
    //两部分： 反转链表 、安装反序的存法来进行加法（反转链表相当于预处理！！）
//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        l1 = reverse(l1);
//        l2 = reverse(l2);
//
//        ListNode dummyRes = new ListNode(-1);
//        ListNode res = dummyRes;
//
//        int l1Val , l2Val;
//        int resVal = 0;
//        int addition = 0;
//        while(null != l1 || null !=l2){
//            l1Val = (null == l1)? 0 : l1.val;
//            l2Val = (null == l2)? 0 : l2.val;
//
//            resVal= (l1Val + l2Val + addition) % 10;
//            addition= (l1Val + l2Val + addition) / 10;
//
//            ListNode resNode = new ListNode(resVal);
//            res.next = resNode;
//            res = res.next;
//
//            if(null != l1){
//                l1 = l1.next;
//            }
//            if(null != l2){
//                l2 = l2.next;
//            }
//        }
//
//        if(addition == 1){
//            ListNode resNode = new ListNode(1);
//            res.next = resNode;
//        }
//
//        return reverse(dummyRes.next); // 结果也需要反转
//    }
//
//    public static ListNode reverse(ListNode head){
//
//        if(null == head){
//            return head;
//        }
//
//        ListNode pre = null;
//        ListNode cur = head;
//
//        while(null != cur){
//            ListNode next = cur.next;
//            cur.next = pre;
//            pre = cur ;
//            cur = next;
//        }
//
//        return pre;
//
//    }


    //递归的方式解决
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int lengthl1 = 0;
        int lengthl2 = 0;
        ListNode p = l1;
        ListNode q = l2;

        while(null != p){
            lengthl1++;
            p = p.next;
        }
        while(null != q){
            lengthl2++;
            q = q.next;
        }

        int count = (lengthl1 - lengthl2) >= 0 ?lengthl1 - lengthl2:lengthl2 - lengthl1 ;
        ListNode dummyL2 = new ListNode(-1);
        ListNode resL2 = dummyL2;
        while(count != 0){
            ListNode zeroNode = new ListNode(0);
            resL2.next = zeroNode;
            resL2 = resL2.next;
            count --;
        }
        if(lengthl1 - lengthl2 >= 0){
            resL2.next = l2;
            this.res = null;
            recurseAdd(l1,dummyL2.next);
        }else{
            resL2.next = l1;
            this.res = null;
            recurseAdd(dummyL2.next,l2);
        }



        if( this.addition == 1 ){
            ListNode addNode = new ListNode(1);
            addNode.next = this.res;
            this.res = addNode;
        }

        return this.res;

    }

    public void recurseAdd(ListNode l1,ListNode l2){
        if(null == l1){
            return;
        }
        recurseAdd(l1.next,l2.next);
        int resVal = (l1.val + l2.val + this.addition) % 10;
        this.addition = (l1.val + l2.val + this.addition) / 10;
        ListNode resNode = new ListNode(resVal);
        resNode.next = this.res;
        this.res = resNode;
    }


}