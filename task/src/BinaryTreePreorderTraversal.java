import myutil.*;


/**
 * 二叉树的前序遍历
 *  leetcode 有相关题目
 * @author zwl
 * @create 2019/4/22
 * @since 1.0.0
 */
public class BinaryTreePreorderTraversal {

    public static void main(String[] args) {

    }

    /**
     * 递归方式的遍历
     * @param root
     */
    public static void preorderTraversal(TreeNode root) {
        if (null != root) {
            System.out.println(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }


    /**
     * 非递归的遍历方式
     * @param root
     */
/*    public static void preorderTraversal(TreeNode root) {
        TreeNode node = root;
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (null != node || !stack.isEmpty()) {
            if (null != node){
                System.out.println(node.val);
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                node = node.right;
            }
        }
    }*/
}
