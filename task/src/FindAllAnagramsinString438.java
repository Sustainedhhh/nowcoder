import java.util.*;

public class FindAllAnagramsinString438 {


    /*
    Input:
    s: "cbaebabacd" p: "abc"

    Output:
            [0, 6]
    */

    public static void main(String[] args) {
//        char[] pc = "ab".toCharArray();
//        Arrays.sort(pc);
//        System.out.println(isAna("ba",pc));
        System.out.println(findAnagrams("cbaebabacd","abc"));


    }


    public static List<Integer> findAnagrams(String s, String p) {
        int[] pCount = new int[26];
        for(char c : p.toCharArray()){
            pCount[c-'a']++;
        }

        int[] sCount = new int[26];

        int r=0;
        List<Integer> res = new ArrayList();
        while(r < s.length()){
            sCount[s.charAt(r)-'a']++;
            if(r >=p.length()){
                sCount[s.charAt(r-p.length())-'a']--;
            }

            if(isAna(sCount,pCount)){
                res.add(r-p.length()+1);
            }
            r++;
        }
        return res;

    }
    public static Boolean isAna(int[] nums1,int[] nums2){
        for(int index=0;index<26;index++){
            if(nums1[index] != nums2[index]){
                return false;
            }

        }
        return true;

    }
}
