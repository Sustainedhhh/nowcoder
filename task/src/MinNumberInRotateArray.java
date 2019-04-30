/**
 * 旋转数组最小值
 * 剑指Offer题目
 * @author zwl
 * @create 2019/4/22
 * @since 1.0.0
 */
public class MinNumberInRotateArray {

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1};
        System.out.println(minNumberInRotateArray(nums));
        int[] nums2 = {1,1,1,1,0,0,0,1};
        System.out.println(minNumberInRotateArray(nums2));

    }


    /**
     * 大致思路为：根据旋转后的数组的特点，采用二分查找的思路；采用两个指针，分别指示旋转区域与未旋转区域；
     * @param array
     * @return
     */
    public static int minNumberInRotateArray(int[] array) {
        if (null == array || 0 == array.length) {
            return 0;
        }
        if (1 == array.length) {
            return array[0];
        }
        int left = 0, right = array.length - 1, mid = 0;
        /**
         * while 条件为确保旋转;
         */
        while (array[left] >= array[right]) {
            if (left == right -1) {
                left = right;
                break;
            }
            mid = left + (right - left) / 2;
            /**
             * 处理重复数字
             */
            if (array[left] == array[right]) {
                right--;
            } else {
                if (array[mid] >= array[left]) {
                    left = mid;
                }
                if (array[mid] <= array[right]) {
                    right = mid;
                }
            }
        }
        return array[left];
    }
}


