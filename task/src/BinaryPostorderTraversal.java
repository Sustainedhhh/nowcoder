import myutil.TreeNode;

/**
 * 二叉树的后序遍历
 * leetcode 有相关题目
 * @author zwl
 * @create 2019/4/22
 * @since 1.0.0
 */
public class BinaryPostorderTraversal {
    public static void main(String[] args) {

    }

    /**
     * 递归方式的后序遍历
     * @param root
     */
    public static void postorderTraversal(TreeNode root) {
        if (null != root) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.println(root.val);
        }
    }

    /**
     * 非递归方式的后序遍历
     * @param root
     */
/*    public static void postorderTraversal(TreeNode root) {
        TreeNode node = root;
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode lastVisit = null;

        while (null != node || !stack.isEmpty()) {
            if (null != node) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.peek();
                if (null == node.right || lastVisit == node.right) {
                    node = stack.pop();
                    System.out.println(node.val);
                    lastVisit = node;
                    node = null;
                } else {
                    node = node.right;
                }
            }

        }
    }*/
}
