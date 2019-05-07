/**
 * DESCRIPTION
 *  对撞指针的一个应用 leetcode 11
 * @author: zwl
 */
public class MaxArea11 {


    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

    }


    /**
     *
     * @param height 高度数组
     * @return
     */
    public static int maxArea(int[] height) {
        int low = 0, high = height.length - 1;
        int max = 0;
        while (low < high) {
            int a = height[low] < height[high] ? height[low] : height[high];
            int b = high - low;
            int res =  a * b;
            max = res < max ? max:res;
            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return max;
    }
}
