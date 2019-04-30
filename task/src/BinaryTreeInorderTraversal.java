import myutil.TreeNode;

import java.util.LinkedList;

/**
 * 二叉树的中序遍历
 * leetcode 有相关题目
 * @author zwl
 * @create 2019/4/22
 * @since 1.0.0
 */
public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {

    }


    /**
     * 递归中序遍历方式
     * @param root
     */
    public static void inorderTraversal(TreeNode root) {
        if (null != root) {
            inorderTraversal(root.left);
            System.out.println(root.val);
            inorderTraversal(root.right);
        }
    }


    /**
     * 非递归的中序遍历
     * @param root
     */
/*
    public static void inorderTraversal(TreeNode root) {
        TreeNode node = root;
        LinkedList<TreeNode> stack = new LinkedList<>();

        while (null != node || !stack.isEmpty()) {
            if (null != node) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                System.out.println(node.val);
                node = node.right;
            }
        }
    }
*/

}
