import myutil.*;
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = ArraysUtil.generateRandomArray(100);
        quickSort(nums,0,nums.length-1);
        ArraysUtil.printArray(nums);
    }


    /**
     * 快排 （挖坑填数法）
     * @param nums 待排数组
     * @param start 排序开始下标
     * @param end 排序结束下标
     */
//    public static void quickSort(int[] nums,int start,int end){
//        if (null == nums || start > end) {
//            throw new IllegalArgumentException("invalid parameters");
//        }else {Q
//            if (start != end) {
//                int base = nums[start];
//                int left = start, right = end;
//                while (left < right) {
//                    while (left < right && nums[right] >= base) {
//                        right--;
//                    }
//                    if (left < right && nums[right] < base) {
//                        nums[left] = nums[right];
//                        left++;
//                    }
//                    while (left < right && nums[left] <= base) {
//                        left++;
//                    }
//                    if (left < right && nums[left] > base) {
//                        nums[right] = nums[left];
//                        right--;
//                    }
//                }
//                nums[left] = base;
//                if (left > start) {
//                    quickSort(nums, start, left - 1);
//                }
//                if (left < end) {
//                    quickSort(nums, left + 1, end);
//                }
//
//            }
//        }
//    }

    /**
     * 快排 （区间法）
     * @param nums 待排数组
     * @param start 排序开始下标
     * @param end 排序结束下标
     */
    public static void quickSort(int[] nums,int start,int end){
        if (null == nums || nums.length == 0){
            return;
        }

        int base = nums[start];
        swap(nums,start,end);
        int small = start - 1;
        for (int i = start;i < end;i++){
            if (nums[i] <= base){
                small++;
                if (small != i){
                    swap(nums,small,i);
                }
            }
        }

        small++;
        swap(nums,small,end);

        if (small > start){
            quickSort(nums,start,small - 1);
        }
        if (small < end){
            quickSort(nums,small + 1,end);
        }
    }

    public static void swap(int[] nums,int src,int des){
        int temp = nums[des];
        nums[des] = nums[src];
        nums[src] = temp;
    }
}
