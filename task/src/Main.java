import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        while(in.hasNext()){
//            String str = in.next();
//            modify(str);
//
//        }

//        System.out.println(modify("wooooowhellloAABBCCDDEE"));


    }



    public static String modify(String str){
        //guize1 AAA
        //i 无效数字 [0,j]有效数字 k=
        int j =  0;
        char[] chars = str.toCharArray();
        for(int i =1;i<chars.length;i++) {
            if (chars[i] != chars[j]) {
                j++;
                chars[j] = chars[i];
            } else {
                if (j == 0) {
                    j++;
                    chars[j] = chars[i];
                } else {
                    if (chars[i] != chars[j - 1]) {
                        j++;
                        chars[j] = chars[i];
                    }
                }
            }
        }
        int k =0;
        for(int i =1;i<=j;i++){
            if(chars[i] != chars[k]){
                k++;
                chars[k] =chars[i];
            }
            else{
                if(k<2){
                    k++;
                    chars[k] = chars[i];
                }
                else{
                    if(chars[k-2] != chars[k-1]){
                        k++;
                        chars[k] = chars[i];
                    }
                }
            }

        }
        return String.valueOf(Arrays.copyOf(chars,k+1));



    }

}