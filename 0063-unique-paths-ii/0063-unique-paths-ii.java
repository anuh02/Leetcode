class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;

        // If the starting cell has an obstacle, no paths are possible
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        // Create a DP array
        int[][] dp = new int[n][m];

        // Initialize the DP array for the first row
        for (int i = 0; i < n; i++) {
            if (obstacleGrid[i][0] == 1) {
                break; // If an obstacle is encountered, no paths are possible beyond this point in the row
            }
            dp[i][0] = 1;
        }

        // Initialize the DP array for the first column
        for (int j = 0; j < m; j++) {
            if (obstacleGrid[0][j] == 1) {
                break; // If an obstacle is encountered, no paths are possible beyond this point in the column
            }
            dp[0][j] = 1;
        }

        // Fill the DP array
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0; // If there's an obstacle, no paths can go through here
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        // The result is stored in the bottom-right cell
        return dp[n - 1][m - 1];
    }
}
