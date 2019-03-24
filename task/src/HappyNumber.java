import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        int sum = 0;
        Set<Integer> set = new HashSet();
        int temp =0;
        int src = n;
        while(sum != 1){
            while(src!=0){
                temp = src % 10;
                sum+=(int)Math.pow(temp,2);
                src /=10;
            }
            if(sum != 1){
                if(!set.contains(sum)){
                    set.add(sum);
                    src = sum;
                    sum=0;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }


}
