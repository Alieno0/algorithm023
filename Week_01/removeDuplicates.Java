package Week_01;

import java.util.Deque;
import java.util.LinkedList;

class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        Deque<Integer> deque = new LinkedList<>();
        // 思路一：set集合，将所有的数放进set里，时间复杂度为On，空间复杂度为On
        // 思路二：判断下一个是否与之相等，若不相等则加一，相等就继续，时间复杂度On，空间复杂度O1
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        int j = 1;
        for (int i=1; i<nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}