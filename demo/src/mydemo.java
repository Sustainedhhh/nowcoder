import java.util.Arrays;
import java.math.*;

public class mydemo{
    public static void main(String[] args){
        int[][] num = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
        int n = 5;
//        System.out.println()
        dp_solution(num,n);
    }

    private static void dp_solution(int[][] num,int len){
        for(int i = len -1;i > 0;i--){
            for(int j = 0;j < i; j++){
                num[i-1][j] = Math.max(num[i][j],num[i][j+1]) + num[i-1][j];
            }
        }
        System.out.println(num[0][0]);
    }

}