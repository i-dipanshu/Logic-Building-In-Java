// Reapeat a arrays elements once the new array
// [1, 2, 3] --> [1, 2, 3, 1, 2, 3];
package Array_Problems;

import java.util.Arrays;

public class ConcatArray {
    static int[] concat(int[] arr){
        int n = arr.length;
        int[] ans = new int[n * 2];

        for(int i = 0; i < 2 * n; i++){
            ans[i] = arr[i % n];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(concat(arr)));
    }
}
