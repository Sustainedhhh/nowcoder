public class pow {
    public static void main(String[] args) {
        System.out.println(pow(2,4));
    }

    /**
     * 求 m^n (指数的二进制表示)
     * @param m 底数
     * @param n 指数
     * @return 结果
     */
    public static int pow(int m, int n){

        int res = 1;
        int power = m;
        while (n != 0){
            if((n & 1) == 1 ){
                res *= power;
            }
            n >>= 1;
            power *= power;
        }
        return res;
    }


}
