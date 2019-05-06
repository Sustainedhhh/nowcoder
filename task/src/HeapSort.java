import myutil.ArraysUtil;

import java.util.List;

/**
 * 选择排序 与 堆排序
 *
 * @author: zwl
 */
public class HeapSort {


    public static void main(String[] args) {
        int[] nums = ArraysUtil.generateRandomArray(20);
        ArraysUtil.printArray(nums);
        selectionSort(nums);
        ArraysUtil.printArray(nums);
        heapSort(nums);
        ArraysUtil.printArray(nums);
    }


    /**
     * 简单选择排序 O(n^2)
     * @param nums
     */
    public static void selectionSort(int[] nums) {
        int index;
        for (int i = 0;i < nums.length;i++) {
            index = i;
            for (int j = i + 1; j < nums.length;j++) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }
            if (index != i){
                nums[i] = nums[i] + nums[index];
                nums[index] = nums[i] - nums[index];
                nums[i] = nums[i] - nums[index];
            }
        }
    }


    /**
     * 堆排序
     * @param nums 待排数组
     */
    public static void heapSort(int[] nums){
        for (int i = nums.length / 2 - 1;i >= 0;i--){
            heapAdjust(i,nums,nums.length -1);
        }
        for (int i = nums.length - 1; i > 0;i--){
            nums[0] = nums[0] + nums[i];
            nums[i] = nums[0] - nums[i];
            nums[0] = nums[0] - nums[i];
            heapAdjust(0,nums,i - 1);
        }
    }

    /**
     * 堆的调整函数
     * @param root 待调整的树根
     * @param nums 待调整的数组
     * @param end 数组中待调整节点序号最大值
     */
    public static void heapAdjust(int root,int[] nums,int end){
        int child = 2 * root + 1;
        int parent = root;
        while (child <= end) {
            if (child < end && nums[child] < nums[child + 1]) {
                child++;
            }
            if (nums[parent] < nums[child]) {
                nums[parent] = nums[parent] + nums[child];
                nums[child] = nums[parent] - nums[child];
                nums[parent] = nums[parent] - nums[child];
                parent = child;
                child = 2 * parent +1;
            } else {
                break;
            }
        }
    }


}


