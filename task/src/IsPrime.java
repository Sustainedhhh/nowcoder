import java.util.ArrayList;
import java.util.List;

/**
 * DESCRIPTION
 * 关于求素数的一些问题
 *
 * @author: zwl
 */
public class IsPrime {
    public static void main(String[] args) {
        List<Integer> res1 = new ArrayList<Integer>();
        List<Integer> res2 = new ArrayList<Integer>();

        res1 = isPrime(100);
        res2 = isPrime2(100);
        System.out.println("res1:");
        for ( int item : res1) {
            System.out.print(item);
            System.out.print(" - ");
        }
        System.out.println();
        System.out.println("res2:");
        for (int item: res2) {
            System.out.print(item);
            System.out.print(" - ");
        }
        for (int i = 0; i < res1.size(); i++) {
            if (res1.get(i).equals(res2.get(i))) {
                System.out.println("false");
                break;
            }
        }

    }

    /**
     * 用来检验埃氏筛是否正确
     * @param n 求2 ~ n的所有素数
     * @return
     */
    public static List<Integer> isPrime2(int n){
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++){
            if (isPrime3(i)){
                res.add(i);
            }
        }
        return res;
    }

    /**
     * 判断一个数是不是素数 ： 注意for的条件 i * i < n;
     * @param n
     * @return
     */
    public static boolean isPrime3(int n){
        for (int i = 2;i * i <= n;i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * 埃氏筛法
     * 求 2~n 的所有素数
     * 思路：从2开始去遍历每一个素数的倍数，每一轮结束最小的数就一定素数（2是最小的素数）
     * @param n
     * @return
     */
    public static List<Integer> isPrime(int n) {
        List<Integer> res = new ArrayList();
        int[] nums = new int[n+1];
        for (int i = 2;i<n+1;i++) {
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
