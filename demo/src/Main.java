import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        String[] arr = new String[m];
        for(int i=0;i<m;i++) {
            arr[i] = scanner.next();
        }
        String str = scanner.next();

        int len = str.length();
        int[] ans = new int[len+1];

        for(int i=1;i<=len;i++) {
            ans[i] = ans[i-1];
            for(int j = 0;j < m;j++) {
                int len2 = arr[j].length();
                if(i - len2 < 0) {
                    continue;
                }

                String sub = str.substring(i - len2,i);

                if(sub.equals(arr[j])) {
                    ans[i] = Math.max(ans[i], ans[i - len2]+1);
                }
            }
        }
        System.out.println(ans[len]);
    }

}