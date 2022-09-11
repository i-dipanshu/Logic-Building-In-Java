/* Build Array from Permutation

 Input: nums = [0,2,1,5,3,4]
 Output: [0,1,2,4,5,3]
 Explanation: The array ans is built as follows: 
 ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
     = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]] = [0,1,2,4,5,3]
*/
package Array_Problems;

import java.util.Arrays;

public class BuildArray {

    static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 0}; // zero permutation array
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
