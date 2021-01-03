package Week_01;

public class mergeTwoArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 从后往前遍历nums2，双指针
        int p1 = m-1;
        int p2 = n-1;
        // 此处为数组一的最后一位
        int p = m+n-1;
        while ((p1>=0) && (p2>=0)) {
            nums1[p--] = nums1[p1] <= nums2[p2] ? nums2[p2--] :nums1[p1--];
        }
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);

    }
}
