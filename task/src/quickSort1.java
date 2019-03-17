public class quickSort1 {


    public static void main(String[] args) {
//        int[] nums = {1,3,2,6,3};
        int[] nums = myUtil.generateRandomArray(100);
        quickSort_1(nums,0,nums.length-1);
        for(int item:nums){
            System.out.print(item+" ");
        }
        System.out.println();

    }


    public static void quickSort_1(int[] nums,int start,int end){
        if(null == nums || start> end){
            throw new IllegalArgumentException("invalid parameters");
        }
        else{
            if(start != end ) {
                int index = partition(nums, start, end);
                if (index > start) {
                    quickSort_1(nums, start, index - 1);
                }
                if (index < end) {
                    quickSort_1(nums, index + 1, end);
                }
            }
        }

    }
    public static int partition(int[] nums,int start,int end){
        if(null == nums || start >end){
            throw new IllegalArgumentException("invalid parameters");
        }
        else{
            int base = nums[start];
            swap(nums,start,end);

            int small = start -1;

            for(int index = start;index<end;index++){
                if(nums[index]<=base){
                    small++;
                    if(small != index){
                        swap(nums,index,small);
                    }
                }
            }
            small++;
            swap(nums,small,end);
            return small;
        }
    }

    public static void swap(int[] nums,int src,int des){
        int temp = nums[des];
        nums[des] = nums[src];
        nums[src] = temp;
    }

}
