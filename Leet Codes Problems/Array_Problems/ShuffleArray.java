/*  Given the array nums consisting of 2n elements in the form 
    [x1,x2,...,xn,y1,y2,...,yn].Return the array in the form 
    [x1,y1,x2,y2,...,xn,yn].
 */
package Array_Problems;

import java.util.Arrays;

public class ShuffleArray {
    static int[] shuffle(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        for(int i = 0, j = 0, index = 0; index < ans.length; i++, j++){
            ans[index ++] = arr[i];
            ans[index ++] = arr[j];
        }
        return ans;
    }
    public static void main(String[] args) {
        // arr must be of even length
        int[] arr = {1, 2, 1, 2};
        System.out.println(Arrays.toString(shuffle(arr)));
    }
}

