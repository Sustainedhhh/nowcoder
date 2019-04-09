import java.util.ArrayList;
import java.util.List;


public class IsPrime {
    public static void main(String[] args) {
        List<Integer> res1 = new ArrayList<Integer>();
        List<Integer> res2 = new ArrayList<Integer>();

        res1 = isPrime(100);
        res2 = isPrime2(100);
        System.out.println("res1:");
        for(int item: res1){
            System.out.print(item);
            System.out.print(" - ");
        }
        System.out.println();
        System.out.println("res2:");
        for(int item: res2){
            System.out.print(item);
            System.out.print(" - ");
        }
        for(int i = 0;i<res1.size();i++){
            if(res1.get(i).equals(res2.get(i))){
                System.out.println("false");
                break;
            }
        }

    }

    public static List<Integer> isPrime2(int n){
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 2;i <= n;i++){
            if(isPrime3(i)){
                res.add(i);
            }
        }
        return res;
    }

    public static boolean isPrime3(int n){
        for (int i = 2;i * i <= n;i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    //埃氏筛
    public static List<Integer> isPrime(int n){
        List<Integer> res = new ArrayList();
        int[] nums = new int[n+1];
        for(int i = 2;i<n+1;i++){
            if(nums[i] != 1) {
                res.add(i);
                for (int j = i * 2; j < n + 1; j += i) {
                    nums[j] = 1;
                }
            }
        }
        return res;

    }



}
