import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring76 {


    public static void main(String[] args) {
       String S = "ADOBECODEBANC", T = "ABC";
        System.out.println(minWindow(S,T));

    }

    public static String minWindow(String s, String t) {

        int l = 0, r = -1;
        Map<Character, Integer> map = new HashMap();
        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        String res = "";
        int min = s.length()+1;
        while (l < s.length() && r < s.length()) {
            if (isEnough(map))  {

                if(min > r-l+1){
                    res = s.substring(l,r+1);
                    min = r-l+1;
                }

                char lChar = s.charAt(l);
                if(map.containsKey(lChar)){
                    map.put(lChar,map.get(lChar)+1);
                }
                l++;
            }
            else{
                r++;
                if(r<s.length()){

                    char rChar = s.charAt(r);
                    if (map.containsKey(rChar)) {
                        map.put(rChar, map.get(rChar) - 1);
                    }
                }


            }
        }
        return res;
    }
        public static Boolean isEnough(Map<Character,Integer> map){
            for(int i : map.values()){
                if(i > 0){
                    return false;
                }
            }
            return true;

        }


    }

