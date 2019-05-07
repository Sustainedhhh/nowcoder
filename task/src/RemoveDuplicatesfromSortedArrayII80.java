/**
 * DESCRIPTION
 * leetcode 80
 * 类似RemoveDuplicates26，区别在于会将重复的数字留下来。
 * @author: zwl
 */
public class RemoveDuplicatesfromSortedArrayII80 {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));


    }

    /**
     * 注意指针的使用 因为会有重复那么有用的数字的个数一定会小于等于所有数的个数
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {

        int noDup = 1;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[noDup]) {
                noDup++;
                nums[noDup] = nums[i];
            } else if (nums[i] != nums[noDup-1]) {
                noDup++;
                nums[noDup] = nums[i];
            }
        }
        return noDup + 1;
    }

}


