class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m  = matrix[0].length;
        int col0 = 1;

        // Marking rows and columns that should be zero
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;  // Mark row

                    if(j == 0)
                        col0 = 0;  // Mark first column separately
                    else
                        matrix[0][j] = 0;  // Mark column
                }
            }
        }

        // Update the matrix excluding first row and first column
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Update the first row if needed
        if(matrix[0][0] == 0) {
            for(int i = 1; i < m; i++) {
                matrix[0][i] = 0;
            }
        }

        // Update the first column if needed
        if(col0 == 0) {
            for(int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
