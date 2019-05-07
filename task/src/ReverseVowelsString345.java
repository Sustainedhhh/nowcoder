/**
 * DESCRIPTION
 *  交换（对调）字符串中的元音字母， hello -> holle leetcode 345
 * @author: zwl
 */
public class ReverseVowelsString345 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }

    /**
     *  交换（对调）字符串中的元音字母， hello -> holle leetcode 345
     * @param s
     * @return
     */
    public static String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] cs = s.toCharArray();
        int low = 0, high = s.length() - 1;
        while (low < high) {
            while (low < high && vowels.indexOf(cs[low]) == -1) {
                low++;
            }
            while (low < high && vowels.indexOf(cs[high]) == -1) {
                high--;
            }
            if (low < high && cs[low] != cs[high]) {
                char c = cs[low];
                cs[low] = cs[high];
                cs[high] = c;
                low++;
                high--;
            } else {
                low++;
                high--;
            }
        }
        return String.valueOf(cs);
    }
}
