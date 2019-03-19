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

//        System.out.println(String.valueOf('a').toUpperCase());
//        System.out.println(String.valueOf('A').toUpperCase());
//        System.out.println(String.valueOf('A').toUpperCase().equals(String.valueOf('a').toUpperCase()));


    }

    public static boolean isPalindrome(String s) {
        if(s.equals("")){
            return true;
        }
        else{
            s = s.toUpperCase();
            int low = 0, high = s.length()-1;
            char lowChar,highChar;
            while(low < high){
                lowChar = s.charAt(low);
                highChar = s.charAt(high);
                while(low<high && !Character.isLetterOrDigit(lowChar)){
                    low++;
                    if(low<high){
                        lowChar = s.charAt(low);
                    }
                }
                while(low<high && !Character.isLetterOrDigit(highChar)){
                    high--;
                    if(low<high){
                        highChar = s.charAt(high);
                    }
                }
                if(low<high) {
                    if (lowChar == highChar ) {
                        low++;
                        high--;
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    //leetcode 别人的方法
//    public static boolean isPalindrome(String s) {
//        if (s == null || s.length() == 0) return true;
//        int i = 0, j = s.length() - 1;
//        s = s.toLowerCase();
//        while (i < j) {
//            final char ic = s.charAt(i);
//            final char jc = s.charAt(j);
//            if (!Character.isLetterOrDigit(ic)) { i++; continue; }
//            if (!Character.isLetterOrDigit(jc)) { j--; continue; }
//            if (ic != jc) return false;
//            i++; j--;
//        }
//        return true;
//    }
}
