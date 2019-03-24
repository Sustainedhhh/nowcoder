import java.util.Arrays;

public class ThreeSumClosest16 {

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums,target));

    }
    //trick 始终向target移动 大于就right-- 小于就left++ 始终注意 left<right限制
    public static int threeSumClosest(int[] nums, int target) {
        if(null == nums || nums.length <3){
            return Integer.MAX_VALUE;
        }

        Arrays.sort(nums);
        int closeTarger = nums[0]+ nums[1]+nums[2];
        for(int i =0;i<nums.length-2;i++){
            while(i>0 && i<nums.length-2 && nums[i] == nums[i-1]){
                i++;
            }
            int left = i+1;
            int right = nums.length -1;
            int temp;
            while(left < right){
                temp = nums[i]+nums[left]+nums[right];
                if(temp ==  target){
                    return target;
                }
                else{
                    if(Math.abs(temp-target) < Math.abs(closeTarger-target) ){
                        closeTarger = temp;
                    }
                    if(temp > target){
                        right--;
                        while(left<right && nums[right] == nums[right+1]){
                            right--;
                        }
                    }
                    else{
                        left++;
                        while(left<right && nums[left] == nums[left-1]){
                            left++;
                        }
                    }
                }
            }
        }
        return closeTarger;
    }
}
