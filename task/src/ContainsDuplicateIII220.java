import java.util.TreeSet;

public class ContainsDuplicateIII220 {

    public static void main(String[] args) {
        int[] nums ={1,2,3,1};
        int k =3;
        int t =0;

        System.out.println(containsNearbyAlmostDuplicate(nums,k,t));

    }

    //使用了TreeSet 有序集合 ceiling(x)函数  >=x的数中最接近x的数;
    // 维护了一个 固定长度的滑动窗口
    public static  boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int i=0,j=0;
        TreeSet<Integer> set = new TreeSet<>();
        for(;j<nums.length;j++){
            if(j>i+k){
                set.remove(nums[i]);
                i++;
            }
            if(null != set.ceiling(nums[j] - t) && set.ceiling(nums[j] - t )<= nums[j]+t){
                return true;
            }else{
                set.add(nums[j]);
            }
        }
        return false;
    }
}
