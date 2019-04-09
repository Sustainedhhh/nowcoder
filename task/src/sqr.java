import java.text.DecimalFormat;

public class sqr {

    public static void main(String[] args) {
        sqr(3);
    }

    /**
     * 开根号 牛顿迭代法 x1 = (x0 + a / x0) 2
     * @param n n
     * @return 结果保留三位小数
     */
    public static void sqr(int n){
        double x1 = 0,x2 = 1;
        while(Math.abs(x1 - x2) > 1e-4){
            x1 = x2;
            x2 = (x1 + n / x1) / 2;
        }
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println(df.format(x2));
    }
}
