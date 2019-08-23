import java.util.*;
import javafx.util.*;


/**
 * leetcode 127
 * 图BFS的应用
 * @author : zgl
 * @date : 2019-06-12
 *
 *  这个题目上需要注意的：
 *      1. 问题的转换：实际上是在求 beginWord 为起点转换至 endWord 的最短路径。
 * 每个word就是一个节点，两个word之间只有一个字母不同则认为存在一条边。
 *      2. (预处理)如何确定两个word之间有边相连：利用了通配式对来连接不同的word。两个word拥有相同的通配式则认为他们之间存在一条边。
 *      3. 速度上： 使用 javafx.util.Pair 的一个队列 比 使用两个队列要慢的多。
 *                 容器中随机访问速度：数组 > HASHSET > ArrayList.indexOf
 *
 *  语法上：
 *      1. String.substring(int startIndex, int endIndex) startIndex、endIndex最多是可以访问到 String.length() 不会报错
 *      2. ArrayList.indexOf 确定一个元素的列表中的位置
 *      3. Java中的配对： javafx.util.Pair<String, String> pair = new Pair<>("Key","Value");
 *                      pair.getKey();
 *                      pair.getValue();
 *                      Map.Entry<String, Integer> entry = AbstractMap.SimpleEntry<>("Key", "Value");
 *                      entry.getKey();
 *                      entry.getValue();
 *      4. 流处理 forEach 与 lambda 表达式
 *
 */

public class WordLadder127 {


    public static void main(String[] args) {

    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int size = beginWord.length();
        Map<String, List<String>> dict = new HashMap<>();
        wordList.forEach(word -> {
            for (int i = 0; i < size; i++) {
                String genericStr = word.substring(0, i) + "*" +
                        word.substring(i + 1, size);
                List<String> wordArray = dict.getOrDefault(genericStr, new ArrayList<String>());
                wordArray.add(word);
                dict.put(genericStr, wordArray);
            }
        });

        LinkedList<String> wordQueue = new LinkedList<>();
        LinkedList<Integer> depthQueue = new LinkedList<>();

        HashSet<String> visited = new HashSet<>();
        wordQueue.offer(beginWord);
        depthQueue.offer(1);

        int len = 0;
        String trans = null;
        Pair<String, Integer> pair = null;
        while (!wordQueue.isEmpty()) {
            trans = wordQueue.poll();
            len = depthQueue.poll();
            if (endWord.equals(trans)) {
                break;
            }
            for (int i = 0; i < size; i++) {
                String genericStr = trans.substring(0, i) + "*" + trans.substring(i + 1, size);
                List<String> wordArray = dict.getOrDefault(genericStr, new ArrayList<String>());
                for (String temp : wordArray) {
                    if (!visited.contains(temp)) {
                        wordQueue.offer(temp);
                        depthQueue.offer(len + 1);
                        visited.add(temp);
                    }
                }
            }
        }
        if (endWord.equals(trans)) {
            return len;
        } else {
            return 0;
        }
    }
}
