import java.util.*;
import java.math.*;

public class mydemo extends Thread{

    public static  boolean flag = false;



    public static void main(String[] args) throws Exception{
            LinkedList<Integer> q = new LinkedList();
            ArrayList<Integer> res = new ArrayList();
            HashMap<Integer,Integer> map = new HashMap<>();
            map.put();

    }




    public static int minGasStation(int numOfGS, int[] distOfGS ,
                                    int[] allowedGasoline,int distance,
                                    int initialGasoline) {
        Queue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer integer, Integer t1) {
                return t1 - integer;
            }
        });
        int retData = 0;
        int currentPosition = 0;
        long currentFuel = initialGasoline;
        while(true){                                       //距离出发位置M
            while(currentPosition < numOfGS && distOfGS[currentPosition] <= currentFuel){
                priorityQueue.add(allowedGasoline[currentPosition]);//加油站的油
                currentPosition++;
            }
            if(currentFuel >= distance){
                return retData;
            }
            if(priorityQueue.isEmpty()){
                return -1;
            }
            currentFuel += priorityQueue.poll();
            retData++;
        }
    }

    public static int min(int num,int projCmptDec,int restDec,int[] errorScore){
        Arrays.sort(errorScore);
        int count = 0;
        while(errorScore[num-1]> 0){
            count++;
            errorScore[num-1] -=projCmptDec;
            for(int i =0;i<num -1;i++){
                errorScore[i] -= restDec;
            }
            Arrays.sort(errorScore);
        }
        return count;
    }




//    private static void dp_solution(int[][] num,int len){
//        for(int i = len -1;i > 0;i--){
//            for(int j = 0;j < i; j++){
//                num[i-1][j] = Math.max(num[i][j],num[i][j+1]) + num[i-1][j];
//            }
//        }
//        System.out.println(num[0][0]);
//    }


}

class TestCls{

    {
        System.out.println("Static Code");
    }

    public final int fInt = 777;
    public static int  sInt= 888;
    public static final int  sfInt= 999;

}