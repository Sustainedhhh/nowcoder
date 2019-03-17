public class RemoveDuplicatesfromSortedArray2 {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));


    }

    public static int removeDuplicates(int[] nums) {

        int noDup = 1;
        for(int i =2; i<nums.length;i++){
            if(nums[i]!= nums[noDup] ){
                noDup++;
                nums[noDup]=nums[i];
            }
            else if (nums[i] !=nums[noDup-1]){
                noDup++;
                nums[noDup]=nums[i];
            }
        }
        return noDup+1;
    }

}


