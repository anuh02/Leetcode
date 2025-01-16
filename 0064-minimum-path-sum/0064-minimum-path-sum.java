class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length; 
        int prev[] = new int[n];
        
        int up=0;
        int left = 0;
        for(int i=0;i<m;i++)
        {
            int cur[] = new int[n];
            for(int j=0;j<n;j++)
            {
               if(i == 0 && j == 0)
               cur[j] = grid[i][j];
               else
               {
                if(i>0)
                up = grid[i][j] + prev[j];
                else
                up = grid[i][j] + (int) Math.pow(10, 9);

                if(j>0)
                left = grid[i][j] + cur[j-1];
                else
                left = grid[i][j]  + (int) Math.pow(10, 9);

                cur[j] = Math.min(up,left);


               } 

            }
            prev = cur;
        } 
        return prev[n-1]; 
    }
}