package Array_Problems;

import java.util.Arrays;

public class RunningSumOf1D {
    static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = nums[0];
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] + nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
