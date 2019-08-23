/**
 * @author : zgl
 * @date : 2019-08-19
 * Address: https://www.bilibili.com/video/av18512769?from=search&seid=17733576534524694530
 *
 */

public class BIlibiliDPStudyCase {

    public static void main(String[] args) {
        int[] array = {3, 34, 4, 12, 5, 2,3, 34, 4, 12, 5, 2,3, 34, 4, 12, 5, 2,3, 34, 4, 12, 5, 2,3, 34, 4, 12, 5, 2};
        int sum = 13;
        long s1 = System.currentTimeMillis();
        System.out.println(recursiveMethod(array, array.length - 1, sum));
        long s2 = System.currentTimeMillis();
        System.out.println(s2 - s1);
        System.out.println(" --- ");
        long s3 = System.currentTimeMillis();

        System.out.println(dpMethod(array, sum));
        long s4 = System.currentTimeMillis();
        System.out.println(s4 - s3);


    }

    /**
     * 递归的方式
     * @param array
     * @param index
     * @param sum
     * @return
     */
    public static boolean recursiveMethod(int[] array, int index, int sum) {

        // 一定要把 index=0 的情况单独拎出来，因为这种情况一定要结束递归了。
        if (index == 0 ) {
            return array[index] == sum;
        }

        if (sum < array[index]) {
            return recursiveMethod(array, index - 1 , sum);
        }

        // 题目限定数组中数字全为正整数，所以不会出现sum=0的情况。sum=0的情况全部以sum=array[index]形式出现、被处理。
        if (sum == array[index]) {
            return true;
        }

        boolean A = recursiveMethod(array, index - 1, sum - array[index]);
        boolean B = recursiveMethod(array, index - 1, sum);

        return A || B;
    }

    /**
     *
     * @param array
     * @param sum
     * @return
     */
    public static boolean dpMethod(int[] array, int sum) {
        boolean[][] record = new boolean[array.length][sum + 1];
        for (int index = 0; index < record[0].length; index++) {
            record[0][index] = (array[0] == index);
        }

        for (int index = 0; index < array.length; index++) {
            record[index][0] = true;
        }

        for (int i_index = 1; i_index < record.length; i_index++) {
            for (int j_index = 1; j_index < record[i_index].length; j_index++) {

                if (array[i_index] > j_index) {
                    record[i_index][j_index] = record[i_index - 1][j_index];
                }

                if (array[i_index] <= j_index) {
                    boolean A = record[i_index - 1][j_index - array[i_index]];
                    boolean B = record[i_index - 1][j_index];
                    record[i_index][j_index] = A || B;
                }
            }
        }

        return record[array.length - 1][sum];
    }
}
