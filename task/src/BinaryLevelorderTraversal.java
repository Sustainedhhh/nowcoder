
import myutil.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树的层次遍历
 * leetcode 有相关题目
 * @author zwl
 * @create 2019/4/22
 * @since 1.0.0
 */
public class BinaryLevelorderTraversal {

    public static void main(String[] args) {

    }


    /**
     * 层次遍历
     * @param root
     */
    public static List<List<Integer>> levelorderTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if (null == root) {
            return res;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode node = null;
        queue.offer(root);
        queue.offer(null);

        List<Integer> resPart ;
        while (!queue.isEmpty()) {
            resPart = new ArrayList<>();

            node = queue.poll();
            while (null != node) {
                resPart.add(node.val);
                if (null != node.left) {
                    queue.offer(node.left);
                }
                if (null != node.right) {
                    queue.offer(node.right);
                }
                node = queue.poll();
            }

            if (!queue.isEmpty()) {
                queue.offer(null);
            }

            res.add(resPart);

        }
        return res;
    }

}
