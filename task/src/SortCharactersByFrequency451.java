import java.util.*;

/**
 * DESCRIPTION
 * 根据字符串中字符出现的频率大小对字符串进行重新排序；
 *
 * 需要注意的是 优先队列的使用！
 * @author:zwl
 */
public class SortCharactersByFrequency451 {

    public static void main(String[] args) {

        System.out.println(frequencySort("eeeee"));

    }

    /**
     * 使用数组下标代表字符的方式。有点复杂，也挺巧妙；
     * @param s
     * @return
     */
    /*
    public static String frequencySort(String s) {
        if(null == s || "".equals(s)){
            return "";
        }
        char[] cs = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        int max=0;

        for(char c : cs){
            map.put(c,map.getOrDefault(c,0)+1);
            max = Math.max(max,map.get(c));
        }

        List<Character>[] list = new ArrayList[max+1];
        for(char c : map.keySet()){
            if(list[map.get(c)]==null){
                list[map.get(c)]=new ArrayList<Character>();
            }
            list[map.get(c)].add(c);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = list.length-1;i > -1;i--){
            if(null != list[i]){
                for(char c : list[i]){
                    for(int j=0;j<i;j++){
                        sb.append(c);
                    }
                }
            }
        }

        return sb.toString();
    }
    */

    /**
     * 使用了优先队列的解法
     * @param s
     * @return
     */
    public static String frequencySort(String s) {
        if(null == s || "".equals(s)){
            return "";
        }
        char[] cs = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char c:cs){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
        pq.addAll(map.entrySet());

        StringBuilder sb =new StringBuilder();
        Map.Entry<Character,Integer> entry ;
        while(!pq.isEmpty()){
            entry = pq.poll();
            for(int i=0;i<entry.getValue();i++){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();


    }

}
