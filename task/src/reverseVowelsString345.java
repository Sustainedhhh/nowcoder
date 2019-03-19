public class reverseVowelsString345 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] cs = s.toCharArray();
        int low=0,high=s.length()-1;
        while(low<high){
            while(low<high && vowels.indexOf(cs[low])== -1){
                low++;
            }
            while(low <high && vowels.indexOf(cs[high])== -1){
                high--;
            }
            if (low < high && cs[low] != cs[high]){
                char c = cs[low];
                cs[low] = cs[high];
                cs[high] = c;
                low++;
                high--;
            }
            else{
                low++;
                high--;
            }
        }
        return String.valueOf(cs);
    }
}
