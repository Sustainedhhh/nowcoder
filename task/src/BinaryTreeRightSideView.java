import javafx.util.Pair;
import myutil.*;

import java.util.*;

/**
 * leetcode 199
 * 使用二叉树的层次遍历就可以搞定
 * 这里只是想实际写一下深度优先遍历的解决方案
 * @author : zgl
 * @date : 2019-06-09
 */
public class BinaryTreeRightSideView {
    public static void main(String[] args) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        Map<Integer,Integer> map  = new HashMap<>();
        List<String> list = new ArrayList<String>(){
            {
                add("I");
                add("am");
                add("your");
                add("father");
            }
        };
        System.out.println("012".substring(3,3));

        Map.Entry<String , String> entry = new AbstractMap.SimpleEntry<>("Key","Value");

    }
}
