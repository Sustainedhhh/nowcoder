/**
 * DESCRIPTION
 * 求字符串的最长回文子串。
 * 大致思路为：回文的寻找必须从回文串的对称点着手，由中间向两侧扩展；而回文串的对称点既可以是自己（aba），也可以是与元素相邻的空隙(aa)；
 * @author: zwl
 */
public class LongestPalindrome {


    public static void main(String[] args) {
        String s = "cccc";
        System.out.println(2>>>8);
//        System.out.println(longestPalindrome(s));
    }

    /**
     * 求最长回文子串
     * @param s
     * @return 最长会问子串
     */
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                /**
                 * 需要特别注意的是：此处对求start的处理。
                 */
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int l = left, r = right;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }

}
