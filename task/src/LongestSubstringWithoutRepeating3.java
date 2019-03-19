import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating3 {


    public static void main(String[] args) {
        String s ="abcabcbb";

//        System.out.println(s.substring(0,0));
        System.out.println(lengthOfLongestSubstring(s));
    }


    //改进方案 使用map来存储 字符及其对应的索引位置
    //也可以使用数组来进行常见的
    /*
    *  int[128] ascii
    *  int[26] 26个字母
    *  int[256] 扩展ascii
    *
    *
    * */

    public static int lengthOfLongestSubstring(String s) {

       if(null == s || s.equals("")){
           return 0;
       }
       else{
           int l = 0, r = 0; // 窗口 [l,r]
           int maxLen = -1;
           Map<Character,Integer> map = new HashMap();
           while(r < s.length()) {
                   if (map.containsKey(s.charAt(r))) {
                       l = Math.max(map.get(s.charAt(r))+1,l);
                   }
                   map.put(s.charAt(r),r);
                   maxLen = Math.max(r-l+1,maxLen);
                   r++;
           }
            return maxLen;
       }
    }
}
