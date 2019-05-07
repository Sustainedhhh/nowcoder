/**
 * DESCRIPTION
 * leetcode 209
 * @author: zwl
 */
public class MinimumSizeSubarraySum209 {

    // 209需要尝试 O(nlogn); Fixme
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,nums));
    }


    /**
     *
     *     Input: s = 7, nums = [2,3,1,2,4,3]
     *     Output: 2
     *     Explanation: the subarray [4,3] has the minimal length under the problem constraint.
     *      注意：区间的移动
     * @param s
     * @param nums
     * @return
     */
    public static int minSubArrayLen(int s, int[] nums) {
        // [l,r] 窗口
        int l = 0, r = -1;
        int sum = 0;
        int res = nums.length + 1;
        while (l < nums.length) {

            if (sum < s && r + 1 < nums.length) {
                r++;
                sum += nums[r];
            } else {
                sum -= nums[l];
                l++;
            }

            if (sum >= s) {
                res = Math.min((r - l + 1), res);
            }

        }
        if (res == nums.length + 1) {
            return 0;
        } else {
            return res;
        }
    }
}
