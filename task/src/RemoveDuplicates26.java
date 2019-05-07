/**
 * DESCRIPTION
 * leetcode 26
 * @author: zwl
 */
public class RemoveDuplicates26 {

    public static void main(String[] args) {

        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));

    }

    /**
     * 指针的使用 类似MoveZeros283 因为会有重复那么有用的数字的个数一定会小于等于所有数的个数
     * @param nums
     * @return 不重复的数字的个数
     */
    public static int removeDuplicates(int[] nums){
        // [0,noDup] 不重复
        int noDup = 0;
        for (int i = 1;i < nums.length; i++) {
            if (nums[i] != nums[noDup]) {
                noDup++;
                nums[noDup] = nums[i];
            }
        }
        return noDup + 1;

    }
}
