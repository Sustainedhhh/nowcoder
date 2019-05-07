import java.util.TreeSet;

/**
 * DESCRIPTION leetcode 220
 *  给定一个数组，问是否存在两个不同的索引i、j，使得|nums[i] - nums[j]| 不大于t，|i - j| 不大于 k;
 * @author: zwl
 */
public class ContainsDuplicateIII220 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        int t = 0;

        System.out.println(containsNearbyAlmostDuplicate(nums,k,t));

    }

    /**
     *  给定一个数组，问是否存在两个不同的索引i、j，使得|nums[i] - nums[j]| 不大于t，|i - j| 不大于 k;
     *
     *  使用了TreeSet 有序集合 ceiling(x)函数  >=x 的数中最接近x的数;
     *  维护了一个 固定长度的滑动窗口
     * @param nums
     * @param k
     * @param t
     * @return
     */
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int i = 0, j = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for (; j < nums.length; j++) {
            if (j > i + k) {
                set.remove(nums[i]);
                i++;
            }
            if (null != set.ceiling(nums[j] - t) && set.ceiling(nums[j] - t ) <= nums[j] + t) {
                return true;
            } else {
                set.add(nums[j]);
            }
        }
        return false;
    }
}
