import java.util.*;
public class daishuguohe{
    public static void main(String[] args) {
        Scanner in = new Scanner("5\n2 0 1 1 1");
        int len = in.nextInt();
        int times=0;
        int max=0;
        int maxIndex=0;
        int[] step = new int[len];
        while(in.hasNext()){
            for(int i=0;i<len;i++){
                step[i]=in.nextInt();
            }
        }
        for(int i =0;i<len;){
            max=step[i]+i;
            if(max>=len){
                times++;
                System.out.println(times);
                break;
            }
            for(int j=1;j<=step[i];j++){
                if(step[i+j]+(i+j)>max){
                    max=step[i+j]+i+j;
                    maxIndex=j;
                }
            }
            if(max==step[i]+i){
                System.out.println(-1);
                break;
            }
            else{
                times++;
                i+=maxIndex;
            }
        }
    }
}