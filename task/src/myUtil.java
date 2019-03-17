import java.util.Random;

public class myUtil {
    public static int[] generateOrderArray(int len,int order){
        int[] result = new int[len];
        //order =1 升序 order =0 降序
        if(order ==1 ){
            for(int i=0;i < len;i++){
                result[i]=i+1;
            }
        }
        else{
            for(int i =len-1;i>-1;i--){
                result[i]=i+1;
            }
        }
        return result;
    }

    public static int[] generateRandomArray(int len){
        Random rand = new Random();
        int[] res = new int[len];
        for(int i=0;i<len;i++){
            res[i] = rand.nextInt(len);
        }
        return res;
    }
    public static void printArray(int[] nums){
        for(int item:nums){
            System.out.print(item+" ");
        }
        System.out.println();
    }
}
