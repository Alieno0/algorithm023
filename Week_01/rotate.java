package Week_01;

public class rotate {
    public void rotate(int[] nums, int k) {
            // 使用双端队列,但不是原地算法
            // 插入，但每次从后往前插都需要改变On次，时间复杂度为Okn
            // 存储要改变的k个元素，将所有元素后移k位，空间复杂度为Ok
            if (nums == null || nums.length==0) return;
        /*
        // 做循环更改：每k个k个的交换，因为最后k个移到前面等于前面的数向后移动k位
        k = k % nums.length;
        // 开始节点
        for (int start=0, count=0; count<nums.length; start++) {
            int current = start;
            int prev = nums[current];
            do {
                current = (k+current)%nums.length;
                int temp = nums[current];
                nums[current] = prev;
                prev = temp;
                count++;
            } while (current != start);
        }
        */

            // 反转，把所有的数字反转，前k个反转，后n-k个反转
            k = k%nums.length;
            reverse(nums, 0, nums.length-1);
            reverse(nums, 0, k-1);
            reverse(nums, k, nums.length-1);

        }

        private void reverse(int[] nums, int start, int end) {
            while(start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;end--;
            }
        }
    }

