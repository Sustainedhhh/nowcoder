import java.util.Random;

/**
 * DESCRIPTION
 * leetcode 283
 * @author: zwl
 */
public class MoveZeros283 {
    public static void main(String[] args) {
        int[] test = {1, 0, 3,0,0, 4};
        moveZeroes(test);
        for(int item : test){
            System.out.println(item);
        }

    }

    /**
     * 指针的使用 实现了在原位置的修改
     * @param num
     */
    public static void moveZeroes(int[] num) {
        int nonZero = 0;
        for (int i = 0;i < num.length;i++) {
            if (num[i] != 0) {
                if (nonZero != i) {
                    num[nonZero] =num[i];
                    num[i] = 0;
                    nonZero++;
                } else {
                    nonZero++;
                }
            }
        }
    }
}
