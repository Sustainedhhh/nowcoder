public class Pow {
    public static void main(String[] args) {
        try {
            System.out.println(pow(3,4));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 求 m^n （指数可能正、可能负）
     * 涉及的问题：指数的二进制表述、二进制数的操作、改善性能的关键是减少运算次数，而不是小数或整数的问题（不是数字本身大小的问题）
     * Java中Math.pow(double a, double b)的实现时交给了操作系统来完成（Native）
     * @param base 底数
     * @param exponent 指数
     * @return 结果
     */
    public static double pow(double base, int exponent) throws Exception{

        if (exponent == 0) {

            return 1;
        } else {

            int positiveExponent = 0;
            if (exponent < 0) {

                if (base == 0) {
                    throw new Exception("底数为0");
                }
                positiveExponent = -1 * exponent;

            } else {

                positiveExponent = exponent;
            }

            double start = base;
            double result = 1;
            while (positiveExponent != 0) {

                if ((positiveExponent & 1) == 1) {

                    result *= start;
                }
                start *= start;
                positiveExponent >>= 1;
            }

            if (exponent < 0) {

                return 1 / result;
            } else {

                return result;
            }
        }
    }

}
