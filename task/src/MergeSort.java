/**
 * DESCRIPTION
 *  归并排序
 * @author:zwl
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] nums = myutil.ArraysUtil.generateRandomArray(10);
        myutil.ArraysUtil.printArray(nums);
        mergeSort(nums);
        myutil.ArraysUtil.printArray(nums);
    }

    /**
     * 归并排序
     * @param nums 待排数组
     */
    public static void mergeSort(int[] nums) {
        int[] temp = new int[nums.length];
        sort(nums,0,nums.length - 1,temp);
    }

    /**
     * 分治
     * @param nums 待排数组
     * @param left 待排部分起点
     * @param right 待排部分终点
     * @param temp 临时用的数组
     */
    public static void sort(int[] nums,int left,int right,int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(nums,left,mid,temp);
            sort(nums,mid + 1,right,temp);
            merge(nums,left,mid,right,temp);
        }
    }

    /**
     *
     * @param nums 待排数组
     * @param left 合并左序列起点
     * @param mid 合并左序列终点
     * @param right 合并右序列终点
     * @param temp 临时用数组
     */
    public static void merge(int[] nums,int left,int mid,int right,int[] temp) {
        int i = left;
        int j = mid + 1;
        int t = 0;
        while(i <= mid && j <= right){
            if(nums[i] <= nums[j]) {
                temp[t] = nums[i];
                t++;
                i++;
            } else {
                temp[t] = nums[j];
                t++;
                j++;
            }
        }

        while(i <= mid) {
            temp[t] =nums[i];
            t++;
            i++;
        }
        while(j <= right) {
            temp[t] = nums[j];
            t++;
            j++;
        }
        t = 0;
        while(left <= right) {
            nums[left] = temp[t];
            left++;
            t++;
        }


    }
}
