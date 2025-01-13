class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1; // Base case: If there's only 1 step.
        
        int prev = 1;  // Equivalent to f(n-1)
        int prev2 = 1; // Equivalent to f(n-2)
        
        for (int i = 2; i <= n; i++) {
            int curi = prev + prev2; // f(i) = f(i-1) + f(i-2)
            prev2 = prev;  // Update f(i-2) to the previous f(i-1)
            prev = curi;   // Update f(i-1) to the current f(i)
        }
        
        return prev; // The result of f(n)
    }
}
