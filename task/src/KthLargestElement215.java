public class KthLargestElement215 {

    public static void main(String[] args) {
//        int[] nums = myUtil.generateRandomArray(8);
        int[] nums = {3,2,1,5,6,4};
        myUtil.printArray(nums);

        quickSort2(nums,0,nums.length-1,2);
        myUtil.printArray(nums);
    }


    public int findKthLargest(int[] nums, int k) {

        quickSort(nums,0,nums.length-1,k);
        myUtil.printArray(nums);
        return nums[k-1];

    }
    //solution 1
    public static void quickSort(int[] nums,int start ,int end,int k){

        if(null != nums && nums.length !=0){

            int base = nums[start];
            swap(nums,start,end);

            int big = start -1;

            for(int index=start;index<end;index++){
                if(nums[index]>=base){
                    big++;
                    if(big != index){
                        swap(nums,big,index);
                    }
                }
            }
            big++;
            swap(nums,big,end);

            if( (k-1) <big  && big > start){
                quickSort(nums,start,big-1,k);
            }
            if( (k-1)>big && big < end){
                quickSort(nums,big+1,end,k);
            }

        }
    }
    public static void swap(int[] nums,int src,int des){
        int temp = nums[src];
        nums[src] = nums[des];
        nums[des] = temp;
    }

    //solution 2

    public static void quickSort2(int[] nums,int start,int end,int k){
        if(null != nums && nums.length !=0){
            int left =start,right = end;
            int base = nums[start];
            while(left < right){

                while(left < right && nums[right]<= base){
                    right --;
                }
                if (left < right && nums[right] >base){
                    nums[left] = nums[right];
                    left++;
                }
                while(left < right && nums[left]>= base){
                    left++;
                }
                if(left < right && nums[left] < base) {
                    nums[right] = nums[left];
                    right--;
                }
            }
            nums[left] = base;
            if((k-1) < left && left >start ){
                quickSort2(nums,start,left-1,k);
            }
            if((k-1) > left && left < end){
                quickSort2(nums,left+1,end,k);
            }

        }


    }

}
