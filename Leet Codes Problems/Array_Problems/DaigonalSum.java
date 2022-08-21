// https://leetcode.com/problems/matrix-diagonal-sum/
package Array_Problems;

public class DaigonalSum {
    class Solution {
        public int diagonalSum(int[][] mat) {
            int sum = 0, i = 0, j = 0;

            for (i = 0, j = 0; i < mat.length; i++, j++) {
                sum += mat[i][j];
            }

            for (i = 0, j = mat.length - 1; i < mat.length; i++, j--) {
                if (i != j) {
                    sum += mat[i][j];
                }
            }
            return sum;
        }
    }
}
