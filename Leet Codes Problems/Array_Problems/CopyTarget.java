// https://leetcode.com/problems/create-target-array-in-the-given-order/
package Array_Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class CopyTarget {
    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> l1 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            l1.add(index[i], nums[i]);
        }

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = l1.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

}