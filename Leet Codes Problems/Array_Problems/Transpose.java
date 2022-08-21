class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix[0].length;
        int coloum = matrix.length;
        
        int[][] ans = new int[row][coloum];
        
        for(int i = 0; i < coloum; i++){
            for(int j = 0; j < row; j++){
                    ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}