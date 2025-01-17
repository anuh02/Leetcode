class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int dp[][] = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = helper(n,0,0,dp,triangle);
        return ans;

    }
    static int helper(int n, int i, int j, int dp[][], List<List<Integer>> triangle)
    {
        if( i == n-1)
        return triangle.get(n-1).get(j);

        if(dp[i][j] != -1)
        return dp[i][j];

        int d = triangle.get(i).get(j) + helper(n,i+1,j,dp,triangle);
        int dg = triangle.get(i).get(j) + helper(n,i+1,j+1,dp,triangle);

        return dp[i][j] = Math.min(d,dg);

    }
}