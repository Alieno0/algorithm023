package Week_03;

class climbStairs {
    public int climbStairs(int n) {
        // 斐波那契
        if (n==1 || n==2) return n;
        int f1 = 1;
        int f2 = 2;
        int swap = 0;
        for (int i=3; i<=n; i++) {
            swap = f1;
            f1 = f2;
            f2 += swap;
        }
        return f2;
    }
}