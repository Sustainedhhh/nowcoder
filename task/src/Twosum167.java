import myutil.*;

public class Twosum167 {

/*
    Input: numbers = [2,7,11,15], target = 9
    Output: [1,2]
    Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
*/

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        ArraysUtil.printArray(twoSum(numbers,target));
    }


    public static int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length-1;
        while(low<high){
            if(low<high && numbers[low]+numbers[high] ==target){
                int[] res = {low+1,high+1};
                return res;
            }
            if(low < high && numbers[low]+numbers[high] < target){
                low++;
            }
            if(low < high && numbers[low]+numbers[high]>target){
                high--;
            }
        }
        return null;
    }
}
