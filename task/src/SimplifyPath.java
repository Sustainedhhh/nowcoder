import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * LeetCode 71 simplifyPath
 *  1、 String.split() 返回分割后的字符串数组。
 *  每个分隔符前的内容为字符串数组中的一个值如 "/home/".split("/") -> ""、"home"。
 *  2、UNIX-Style 绝对路径一定从根目录开始，并且化简时顺序是从左至右。
 * @author : zgl
 * @date : 2019-06-07
 */
public class SimplifyPath {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>() {
            {
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            }
        };
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
//    public static void main(String[] args) {
//        String[] test = {"/home/", "/../", "/home//foo/", "/a/./b/../../c/", "/a/../../b/../c//.//", "/a//b////c/d//././/.."};
//
//        for (String str: test) {
//            System.out.println(solution(str));
//        }
//    }

    private static String solution(String path) {
        String[] paths = path.split("/");
        LinkedList<String> stack = new LinkedList<>();

        for (String strIter : paths) {
            if (".".equals(strIter) || "".equals(strIter)) {
                continue;
            }

            if ("..".equals(strIter)) {
                if (stack.isEmpty()){
                    continue;
                } else {
                    stack.pop();
                    continue;
                }
            }

            stack.push(strIter);
        }
        StringBuilder sb = new StringBuilder();

        if (stack.isEmpty()){
            return "/";
        } else {
            while (!stack.isEmpty()) {
                sb.insert(0, stack.pop());
                sb.insert(0,'/');
            }
            return sb.toString();
        }
    }
}
