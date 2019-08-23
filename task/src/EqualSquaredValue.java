/**
 * 狗哥给的题。
 *
 * 求一有正有负的有序数组中，平方值相等的数的个数。
 * e.g. [-2, -1, 0, 1, 2, 3]
 *   平方值相等的两个数，则其绝对值相等。对于负数而言，其值从小到大升序排序，则其绝对值为从大到小降序排列。
 *   对于上述的例子，分为两部分。负数序列和正数序列，对于负数序列，其绝对值从左至右为降序。对于正数序列，从右至左，
 * 其绝对值为降序序列。合并两个降序序列，去掉重复即为答案。
 * @author : zgl
 * @date : 2019-08-23
 */
public class EqualSquaredValue {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(countDiffAbsValue(array));


    }

    public static int countDiffAbsValue(int[] array) {
        int left = 0;
        int right = array.length - 1;
        int count = 0;
        int absValue = -1;
        while (left < array.length && array[left] < 0 || right > -1 && array[right] >= 0) {

            // 正数序列
            while (right > -1 && array[right] >= 0 && array[right] >= (-1 * array[left])) {
                if (array[right] != absValue) {
                    absValue = array[right];
                    count++;
                }
                right--;
            }

            // 负数序列
            while (left < array.length && array[left] < 0 && (-1 * array[left]) >= array[right]) {
                if ((-1 * array[left]) != absValue) {
                    absValue = (-1 * array[left]);
                    count++;
                }
                left++;
            }
        }

        return count;
    }
}