/**
 * DESCRIPTION
 *  矩阵的乘法
 * @author: zwl
 */
public class MatrixUtil {


    public static void main(String[] args) {

/*        int[][] matrix1 = {{1,2,3},{3,2,1},{2,3,4}};
        int[][] matrix2 = {{1,2,3},{3,2,1},{2,3,4}};

        int[][] res1 = matrixMult(matrix1,matrix2);
        int[][] res2 = matrixMult2(matrix1,matrix2);

        int row = res1.length;
        int col = res1[0].length;
        for (int i = 0;i < row;i++){
            for (int j = 0;j < col;j++){
                System.out.print(res1[i][j]+" ");
                if (res1[i][j] != res2[i][j]){
                    return;
                }
            }
            System.out.println();
        }
        System.out.println("equals");*/




    }


    /**
     * 矩阵的乘法运算（三层for循环）
     * @param matrix1 左侧乘数
     * @param matrix2 右侧乘数
     * @return 返回新的数组
     */
    public static int[][] matrixMult(int[][] matrix1,int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            throw new UnsupportedOperationException("matrixMult");
        }
        int row = matrix1.length;
        int col = matrix2[0].length;
        int com = matrix1[0].length;
        int[][] res = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0;k < com; k++) {
                    res[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return res;
    }



/*    public  static int[][] matrixMult2(int[][] a, int[][] b) {
        assert a.length == b[0].length;
        int n = a.length, m = a[0].length, p = b[0].length;
        int[][] result = new int[n][p];
        for(int i=0; i<n; i++) {
            for(int j=0; j<p; j++) {
                for(int k=0; k<m; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }*/

}
