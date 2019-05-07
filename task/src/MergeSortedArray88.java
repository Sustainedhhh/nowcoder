/**
 * DESCRIPTION
 * leetcode easy 88
 * @author:
 */
public class MergeSortedArray88 {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0}, nums2 ={2,5,6};
        int m =3,n =3;
        merge(nums1,m,nums2,n);
        for(int item:nums1){
            System.out.println(item);
        }
    }

    /**
     *  需要注意的是 字段的含义
     * @param nums1 nums1 长度足够放置所有数
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1[0,sort] sorted
        int sort = m - 1;
        // nums2[unsort,num2.length-1];
        int unsort = 0;
        while (unsort < nums2.length) {
            for (int i = 0, j = unsort;;) {
                if (nums1[i] <= nums2[j]) {
                    i++;
                } else {
                    int temp = nums2[j];
                    nums2[j] = nums1[i];
                    nums1[i] = temp;
                }
                if (i > sort) {
                    sort++;
                    nums1[sort] = nums2[unsort];
                    unsort++;
                    break;
                }
            }
        }
    }

}



