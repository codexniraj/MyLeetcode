class Solution {
    public int integerBreak(int n) {
        if (n <= 3) {
            return n - 1;
        }
        
        int a = 1;
        while (n > 4) {
            a *= 3;
            n -= 3;
        }
        
        return a * n;
    }
}