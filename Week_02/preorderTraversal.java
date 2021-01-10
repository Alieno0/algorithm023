package Week_02;

import java.util.*;

public class preorderTraversal {
        public List<Integer> preorderTraversal(TreeNode root) {
        /*
        // 递归
        List<Integer> list = new LinkedList<>();
        preorder(root, list);
        return list;
        */
            // 循环实现
            List<Integer> list = new ArrayList<>();
            if (root == null) return list;
            Deque<TreeNode> deque = new LinkedList<>();
            TreeNode current = root;
            while (!deque.isEmpty() || current != null) {
                while (current != null) {
                    list.add(current.val);
                    deque.push(current);
                    current = current.left;
                }
                current = deque.pop();
                current = current.right;
            }
            return list;

        }

        private void preorder(TreeNode node, List<Integer> list) {
            if (node == null) return;
            list.add(node.val);
            preorder(node.left, list);
            preorder(node.right, list);
        }
}
