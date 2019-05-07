import java.text.DecimalFormat;

/**
 * DESCRIPTION
 *  开平方的两种实现方式
 * @author: zwl
 */
public class Sqrt {

    public static void main(String[] args) {
//        int[] nums = myutil.generateRandomArray(30);
//        System.out.print("原始数字：");
//        for (int num : nums) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//
//        DecimalFormat df = new DecimalFormat("0.000");
//        System.out.print("Math.sqrt: ");
//        for(int num : nums) {
//            System.out.print(df.format(Math.sqrt(num)) + " ");
//        }
//        System.out.println();
//
//        System.out.print("sqrt: ");
//        for(int num : nums) {
//            sqrt(num, 4);
//        }
//        System.out.println();
//
//        System.out.println("sqrt2: ");
//        for(int num : nums) {
//            sqrt2(num,4);
//        }
        long startTime = System.currentTimeMillis();
        sqrt2(16,1);
        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.println("total Time: " + (endTime - startTime));
    }

    /**
     * 开根号 牛顿迭代法
     * 关键的表达式： x1 = (x0 + a / x0) / 2
     * @param n n
     * @param accuracy 精度
     * 结果保留 accuracy 位小数
     */
    public static void sqrt(int n, int accuracy) {
        double x1 = 0, x2 = 1;
        if (n == 0) {
            x2 = 0;
        } else {
            double accuracyStd = Math.pow(10, (-1) * (accuracy + 1));
            while (Math.abs(x1 - x2) > accuracyStd) {
                x1 = x2;
                x2 = (x1 + n / x1) / 2;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("0.");
        for(int i = 0; i < accuracy; i++) {
            sb.append('0');
        }
        DecimalFormat df = new DecimalFormat(sb.toString());

        System.out.print(df.format(x2) + " ");
    }

    /**
     * 开根号 二分查找的方式
     *
     * @param n 待处理数
     * @param accuracy 精度
     */
    public static void sqrt2(int n, int accuracy) {
        double accuracyNum = Math.pow(10, (-1) * accuracy);
        double low = 1, high = n;
        double mid  = 0;
        double tempRes = 0;
        int count = 0;

        while (low < high) {
            mid = low + (high - low) / 2;
            tempRes = mid * mid;

            count++;

            if (Math.abs(tempRes - n) <= accuracyNum) {
                break;
            }

            if (tempRes < n) {
                low = mid + accuracyNum;
            }

            if (tempRes > n) {
                high = mid - accuracyNum;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("0.");
        for(int i = 0; i < accuracy; i++) {
            sb.append('0');
        }
        DecimalFormat df = new DecimalFormat(sb.toString());

        System.out.println("count: " + count);
        System.out.print(df.format(mid));
    }
}
