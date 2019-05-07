/**
 * DESCRIPTION
 * leetcode 125 (做了好久的题.题目没读清楚，大锅)
 * @author: zwl
 */
public class ValidPalindrome125 {

    /*
    Example 1:

    Input: "A man, a plan, a canal: Panama"
    Output: true
    Example 2:

    Input: "race a car"
    Output: false*/
    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("0p"));

    }

    /**
     * leetcode 别人的方法
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int i = 0, j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j) {
            final char ic = s.charAt(i);
            final char jc = s.charAt(j);
            if (!Character.isLetterOrDigit(ic)) { i++; continue; }
            if (!Character.isLetterOrDigit(jc)) { j--; continue; }
            if (ic != jc) return false;
            i++; j--;
        }
        return true;
    }
}
