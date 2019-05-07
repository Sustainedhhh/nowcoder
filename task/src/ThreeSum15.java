import java.util.*;

/**
 * DESCRIPTION
 * leetcode 15
 * @author: zwl
 */
public class ThreeSum15 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
//        int[] nums = {0,0,0,0};
        System.out.println(threeSum(nums));
    }

    /**
     *     1. 对撞指针的解法
     * @param nums
     * @return
     */
    /*public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        if (null == nums || nums.length < 3) {
            return res;
        }

        int left ,right;

        for (int i =0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            while (0 < i && i < nums.length - 2 && nums[i] == nums[i - 1]) {
                i++;
            }
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left-1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }*/

    /**
     *     2. 查表解法
     * @param nums
     * @return
     */
    public  static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        if (null == nums || nums.length < 3) {
            return res;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length -2; i++) {
            if (nums[i] > 0) {
                break;
            }
            while (i > 0 && i < nums.length - 2 && nums[i] == nums[i-1]) {
                i++;
            }
            if (i >= nums.length - 2) {
                break;
            }
            int target = 0 - nums[i];
            Set<Integer> record = new HashSet<>();
            for (int j = i + 1;j < nums.length;) {
                if (record.contains(nums[j])) {
                    if (nums[j] + nums[j] == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[j]));
                        j++;
                        while (j < nums.length && nums[j] == nums[j - 1]) {
                            j++;
                        }
                    } else {
                        j++;
                    }
                } else {
                    record.add(nums[j]);
                    j++;
                }
            }
            Set<Integer> set = new HashSet<>();
            for (int item : record) {
                if (item != target - item && record.contains(target - item) && !set.contains(item) && !set.contains(target - item)) {
                    res.add(Arrays.asList(nums[i], item, target - item));
                    set.add(item);
                    set.add(target-item);
                }
            }
        }
        return res;
    }
}
