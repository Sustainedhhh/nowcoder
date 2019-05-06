import java.util.*;


public class mydemo implements Cloneable{

    public static void main(String[] args) {
        int[] nums = {1,3,4};
        int[] nums3 = nums;
        int[] nums2 = nums.clone();
        System.out.println(nums == nums2);
        System.out.println(nums3 == nums);
        TreeSet<Integer> set = new TreeSet<>();
        LinkedHashSet set2 = new LinkedHashSet();
    }




//        Scanner in = new Scanner(System.in);
//        int len = in.nextInt();
//        int[] pow = new int[len];
//        int[] con = new int[len];
//        for (int i = 0; i < len; i++) {
//            pow[i] = in.nextInt();
//        }
//        for (int i = 0; i < len; i++) {
//            con[i] = in.nextInt();
//        }
//
//        int[] opt_con = new int[len];
//        int[] opt_pow = new int[len];
//        for (int i = 0; i < len; i++) {
//            if (i == 0) {
//                opt_con[0] = con[0];
//                opt_pow[0] = pow[0];
//            } else {
//                if (opt_pow[i - 1] < pow[i]) {
//                    opt_pow[i] = opt_pow[i - 1] + pow[i];
//                    opt_con[i] = opt_con[i - 1] + con[i];
//                } else {
//                    opt_pow[i] = opt_pow[i - 1];
//                    opt_con[i] = opt_con[i - 1];
//                }
//            }
//        }
//        System.out.println(opt_con[len - 1]);


//        Scanner in = new Scanner(System.in);
//        int len = in.nextInt();
//        long[] pow = new long[len];
//        int[] con = new int[len];
//        for (int i = 0; i < len; i++){
//            pow[i] = in.nextLong();
//        }
//        for (int i = 0; i < len; i++){
//            con[i] = in.nextInt();
//        }
//
//        int[] opt_con = new int[len];
//        long[] opt_pow = new long[len];
//        for (int i =0;i < len; i++){
//            if (i == 0){
//                opt_con[0] = con[0];
//                opt_pow[0] = pow[0];
//            }else{
//                if(opt_pow[i-1] < pow[i]){
//                    opt_pow[i] = opt_pow[i - 1]+ pow[i];
//                    opt_con[i] = opt_con[i - 1] + con[i];
//                }else {
//                    opt_pow[i] = opt_pow[i - 1];
//                    opt_con[i] = opt_con[i - 1];
//                }
//            }
//        }
//        System.out.println(opt_con[len - 1 ]);

//    }






//        Scanner in = new Scanner(System.in);
//        int len;
//        if (in.hasNext()){
//            len = in.nextInt();
//        }
//        else{
//            return;
//        }
//        String str;
//        if (in.hasNext()){
//            str = in.next();
//        }
//        else{
//            return;
//        }
//        if(null == str || str.length() == 0) {
//            return;
//        }
//
//        List<Character> ca = new ArrayList();
//        ca.add(str.charAt(0));
//        for (int i = 1;i < len;i++ ){
//            if (ca.isEmpty()){
//                ca.add(str.charAt(i));
//            }else{
//                String temp = ""+ ca.get(ca.size() - 1) + str.charAt(i);
//                if(temp.equals("01") || temp.equals("10")){
//                    ca.remove(ca.size() -1);
//                }
//                else{
//                    ca.add(str.charAt(i));
//                }
//            }
//        }
//        System.out.println(ca.size());
//        }








//public static int opt(int[] nums){
//        int len = nums.length;
//        int[] opt = new int[len];
//
//        opt[0] = nums[0];
//        opt[1] = nums[1] >= nums[0] ? nums[1] : nums[0];
//
//        for (int i = 2;i < len;i++ ){
//            int val1 = nums[i] + opt[i - 2];
//            int val2 = opt[i - 1];
//            opt[i] = val1 >= val2 ? val1 : val2;
//        }
//        return opt[len - 1];
//
//}







//    public static int findPosition(int input1,int input2,int[][] input3){
//        List<Integer> q = new ArrayList<Integer>();
//        int count  = 0;
//        for (int i = 1; i < input1 +1;i++){
//            q.add(i);
//        }
//        for (int i = 0;i < input2;i++){
//            if (input3[i][0] == 1){
//                if(q.size() == 0){
//                    throw new UnsupportedOperationException("findPosition(int input1,int input2,int[][] input3)");
//                }
//                else{
//                    q.remove(0);
//                }
//            }
//            if (input3[i][0] == 2){
//                if(q.contains(input3[i][1])){
//                    q.remove(new Integer(input3[i][1]));
//
//                }
//                else{
//                    throw new UnsupportedOperationException("findPosition(int input1,int input2,int[][] input3)");
//                }
//            }
//            if(input3[i][0] == 3){
//                if(q.contains(input3[i][1])){
//
//                    count += q.indexOf(input3[i][1])+1;
//                }
//                else{
//                            throw new UnsupportedOperationException("findPosition(int input1,int input2,int[][] input3)");
//                }
//            }
//        }
//        return count;
//
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