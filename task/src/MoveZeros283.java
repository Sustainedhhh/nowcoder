import java.util.Random;

public class MoveZeros283 {
    public static void main(String[] args) {
//        int[] test = {1, 0, 3,0,0, 4};
//        moveZeroes(test);
//        for(int item : test){
//            System.out.println(item);
//        }

    }


    //public static void moveZeroes(int[] num){
//    int[] numCopy = new int[num.length];
//    System.arraycopy(num,0,numCopy,0,num.length);
//    int numIndex =0;
//    for(int numCopyindex = 0; numCopyindex < num.length ; numCopyindex++){
//     if(numCopy[numCopyindex] != 0){
//         num[numIndex] = numCopy[numCopyindex];
//         numIndex++;
//     }
//    }
//    for(;numIndex < num.length;numIndex++){
//        num[numIndex] = 0;
//    }
//}
//    public static void moveZeroes(int[] num){
//        int nonZero = 0;  //num[0,nonZero)元素均为非零元素 （下一个非零元素的位置）
//        for(int i = 0; i < num.length;i++){
//            if(num[i] !=0){
//                num[nonZero] = num[i];
//                nonZero++;
//            }
//        }
//        for(;nonZero < num.length;nonZero++){
//            num[nonZero] = 0;
//        }
//    }
    public static void moveZeroes(int[] num){
        int nonZero = 0;
        for(int i =0;i < num.length;i++){
            if(num[i] != 0){
                if(nonZero != i){
                    num[nonZero] =num[i];
                    num[i] = 0;
                    nonZero++;
                }
                else{
                    nonZero++;
                }
            }
        }
    }
}
