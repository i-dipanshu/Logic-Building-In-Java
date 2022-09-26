package Binary_Search;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 5, 14},
            {4, 6, 8, 16},
            {7, 9, 12, 18}
        };
        int target = 18;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    // matrix of (m x n)
    /*
        [1, 3, 5, 8] 
        [4, 6, 8, 10] 
        [5, 7, 10, 14] 
     */

    static int[] search(int[][] arr, int target){
        int row = 0, colum = arr[0].length - 1;
        int[] index = {-1, -1};

        while(row < arr.length && colum >= 0){
            // element found
            if (target == arr[row][colum]) {
                index[0] = row;
                index[1] = colum;
                return index;
            }

            if (target > arr[row][colum]) {
                row++;
            }

            if (target < arr[row][colum]) {
                colum--;
            }
        }
        return index;
    }
}
