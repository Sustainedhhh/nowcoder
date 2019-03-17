public class quickSort2 {
    public static void main(String[] args) {
        int[] nums = myUtil.generateRandomArray(100);
        quickSort(nums,0,nums.length-1);
        myUtil.printArray(nums);
    }
    public static void quickSort(int[] nums,int start,int end){
        if(null == nums || start > end){
            throw new IllegalArgumentException("invalid parameters");
        }
        else{
            if(start!=end){
                int base = nums[start];
                int left = start,right = end;
                while(left < right){
                    while(left<right && nums[right]>=base){
                        right--;
                    }
                    if(left<right && nums[right]<base) {
                        nums[left] = nums[right];
                        left++;
                    }
                    while(left<right && nums[left] <= base){
                        left++;
                    }
                    if(left<right && nums[left]>base){
                        nums[right] = nums[left];
                        right--;
                    }
                }
                nums[left] = base;
                if(left>start) {
                    quickSort(nums,start,left-1);
                }
                if(left <end){
                    quickSort(nums,left+1,end);
                }

            }
        }



    }

    public static void swap(int[] nums,int src,int des){
        int temp = nums[des];
        nums[des] = nums[src];
        nums[src] = temp;
    }
}
