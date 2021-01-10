package Week_02;


import java.util.*;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


class preorder {
    public List<Integer> preorder(Node root) {
        /* 递归方法
        List<Integer> list = new ArrayList<>();
        preNorder(root, list);
        return list;
        */
        // 迭代
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Deque<Node> deque = new LinkedList<>();
        deque.push(root);
        while (!deque.isEmpty()) {
            Node current = deque.pop();
            list.add(current.val);
            Collections.reverse(current.children);
            for (Node now : current.children) {
                deque.push(now);
            }
        }
        return list;
    }

    private void preNorder(Node node, List<Integer> list) {
        if (node == null) return;
        list.add(node.val);
        for (Node current : node.children) {
            preNorder(current, list);
        }
    }
}