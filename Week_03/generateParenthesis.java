package Week_03;

import java.util.LinkedList;
import java.util.List;

class generateParenthesis {
    List<String> list = new LinkedList<>();

    public List<String> generateParenthesis(int n) {
        if (n <= 0) return list;
        generate(0, 0, n, "");
        return list;
    }

    private void generate(int left, int right, int n, String s) {
        // 终止条件
        if (left == n && right == n) {
            list.add(s);
            return;
        }
        // 当前层逻辑

        // 递归到下一层
        if (left < n) generate(left+1, right, n, s+"(");
        if (right < left) generate(left, right+1, n, s+")");
        // 清除当前状态
    }
}