public class removeDuplicates {

    public static void main(String[] args) {

        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));

    }

    public static  int removeDuplicates(int[] nums){
            //[1,1,2]
        int noDup = 0; //[0,noDup) 不重复

        for(int i =0,j=0;i<nums.length;i++ ){
            if((i+1) == nums.length || nums[i] != nums[i+1])  {
                nums[noDup] = nums[i];
                noDup++;
            }
        }
        return noDup;


    }
}
