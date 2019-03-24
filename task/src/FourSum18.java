import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum18 {


    public static void main(String[] args) {
        int[] nums = {-3,-1,0,2,4,5};
        int target = 1;
        System.out.println(fourSum(nums,target));
    }



    public static  List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        if(null == nums || nums.length < 4 ){
            return res;
        }

        Arrays.sort(nums);

        for(int i =0 ;i<nums.length-3;i++){
           while(i > 0 && i<nums.length-3 && nums[i]== nums[i-1]){
               i++;
           }
           for(int j = i+1;j<nums.length-2;j++){
               int target2 = target - nums[i];
               while(j > i+1 && j<nums.length-2 && nums[j]==nums[j-1]){
                   j++;
               }
               int left = j+1;
               int right = nums.length-1;
               int target3 = target2 -nums[j];
               while(left<right){
                   if(nums[left]+nums[right]== target3){
                       res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                       left++;
                       right--;
                       while(left<right && nums[left]==nums[left-1] ){ //nums[left-1] 竟然写成了 nums[left--] 然后就G了
                           left++;
                       }
                       while(left<right && nums[right]==nums[right+1]){
                           right--;
                       }
                   }
                   else{
                       if(nums[left]+nums[right]>target3){
                           right--;
                       }
                       else{
                           left++;
                       }
                   }
               }
           }

        }

        return res;
    }
}
