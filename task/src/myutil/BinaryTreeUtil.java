package myutil;

import java.util.LinkedList;

public class BinaryTreeUtil {
    /**
     * 从数组中创建二叉树
     * @param nums 待使用数组
     * @return 二叉树头结点
     */
    public static TreeNode createBinaryTree(Integer[] nums){
        if (0 == nums.length){
            return null;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.offer(new TreeNode(nums[0]));
        TreeNode root = queue.peek();
        TreeNode node = null;
        int index = 0;
        while (index < nums.length){
            node = queue.poll();
            index++;
            if (index < nums.length && null != nums[index]){
                node.left = new TreeNode(nums[index]);
                queue.offer(node.left);
            }
            index++;
            if (index < nums.length && null != nums[index]){
                node.right = new TreeNode(nums[index]);
                queue.offer(node.right);
            }
        }
        return root;
    }

    /**
     * 层次遍历的顺序 打印数组
     * fixme：有错，null值无法正确输出；非最底层的节点的null要输出，即使左右子树都为空；
     * @param root 待打印数组
     */
    public static void printLevelTraversal(TreeNode root){
        if (null == root){
            return;
        }
        LinkedList<TreeNode>  queue = new LinkedList<>();

        queue.offer(root);
        TreeNode node;
        while (!queue.isEmpty()){
            node = queue.poll();
            while (null == node && !queue.isEmpty()){
                System.out.print("NUll ");
                node = queue.poll();
            }
            if (null != node){
                System.out.print(node.val+" ");

                if (null != node.left || null != node.right){
                    queue.offer(node.left);
                }
                if (null != node.right || null != node.left){
                    queue.offer(node.right);
                }
            }
        }
    }
}
