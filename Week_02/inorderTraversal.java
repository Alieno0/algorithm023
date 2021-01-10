package Week_02;

import java.util.*;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
 this.right = right;
 }
 }

public class inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        /*
        // 递归方式
        List<Integer> list = new LinkedList<>();
        inorder(root, list);
        return list;
        */
        // 循环方式
        List<Integer> list = new LinkedList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode current = root;
        // current不为空代表没遍历完，stack不为空代表遍历到叶子节点
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            list.add(current.val);
            current = current.right;
        }
        return list;
    }

    private void inorder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }
}
