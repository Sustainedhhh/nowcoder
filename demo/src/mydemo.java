import java.util.*;
import java.math.*;

public class mydemo {
    public static void main(String[] args) {
        //有序队列的使用
//        Random random = new Random();
//        int[] nums = new int[10];
//        for (int i = 0;i < nums.length; i++) {
//            nums[i] = random.nextInt(100) + 10 * i;
//        }
//        System.out.println("Nums ");
//        for (int i:nums) {
//            System.out.print(i + " ");
//        }
//        HashMap<Integer,Integer> hashmap = new HashMap<>();
//        Queue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) ->  b.getValue() - a.getValue());
//        for (int i = 0;i < nums.length; i++) {
//            hashmap.put(nums[i],nums[i]);
//        }
//        System.out.println();
//        System.out.println("Map Entry");
//        for (Map.Entry entry:hashmap.entrySet()){
//            System.out.print(entry.getValue() + " ");
//        }
//
//        for (Map.Entry entry:hashmap.entrySet()) {
//            pq.offer(entry);
//        }
//        System.out.println();
//        System.out.println("Queue ");
//        while(!pq.isEmpty()) {
//            System.out.print(pq.poll() + " ");
//        }

        BigInteger big = new BigInteger("100");
        BigInteger add = new BigInteger("1");
        BigInteger res = big.add(add);
        System.out.println(res.compareTo(big));
    }





//    public static int minGasStation(int numOfGS, int[] distOfGS ,
//                                    int[] allowedGasoline,int distance,
//                                    int initialGasoline) {
//        Queue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
//            public int compare(Integer integer, Integer t1) {
//                return t1 - integer;
//            }
//        });
//        int retData = 0;
//        int currentPosition = 0;
//        long currentFuel = initialGasoline;
//        while(true){                                       //距离出发位置M
//            while(currentPosition < numOfGS && distOfGS[currentPosition] <= currentFuel){
//                priorityQueue.add(allowedGasoline[currentPosition]);//加油站的油
//                currentPosition++;
//            }
//            if(currentFuel >= distance){
//                return retData;
//            }
//            if(priorityQueue.isEmpty()){
//                return -1;
//            }
//            currentFuel += priorityQueue.poll();
//            retData++;
//        }
//    }

//    public static int min(int num,int projCmptDec,int restDec,int[] errorScore){
//        Arrays.sort(errorScore);
//        int count = 0;
//        while(errorScore[num-1]> 0){
//            count++;
//            errorScore[num-1] -=projCmptDec;
//            for(int i =0;i<num -1;i++){
//                errorScore[i] -= restDec;
//            }
//            Arrays.sort(errorScore);
//        }
//        return count;
//    }




//    private static void dp_solution(int[][] num,int len){
//        for(int i = len -1;i > 0;i--){
//            for(int j = 0;j < i; j++){
//                num[i-1][j] = Math.max(num[i][j],num[i][j+1]) + num[i-1][j];
//            }
//        }
//        System.out.println(num[0][0]);
//    }


}