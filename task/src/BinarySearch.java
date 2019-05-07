import myutil.*;

/**
 * DESCRIPTION 二分查找
 *
 * @author: zwl
 */
public class BinarySearch {
    public static void main(String[] args) {

        int len = 100000;
        int[] arr = ArraysUtil.generateOrderArray(len, 1);
        for (int i : arr) {
            System.out.println(i);
        }
        for (int i = 0; i < len; i++) {
            if (binarysearch(arr, i + 1) != i) {
                System.out.println("Error");
                return;
            }
        }
        System.out.println("Ok");
    }

    /**
     * 二分查找
     * @param arr
     * @param target
     * @return
     */
    public static int binarysearch(int[] arr, int target) {
        int len = arr.length;
        /**
         * 代表了[l,r]闭区间,明确变量的含义，区间的含义
         */
        int l = 0, r = len - 1;
        /**
         * 防止 int 溢出的处理
         */
        int mid = l + (r - l) / 2;
        while (l <= r) {
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                l = mid + 1;
                mid = l + (r - l) / 2;
            } else {
                r = mid - 1;
                mid = l + (r - l) / 2;
            }
        }
        return -1;
    }
}
