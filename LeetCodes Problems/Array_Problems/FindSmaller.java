package Array_Problems;

import java.util.Arrays;

public class FindSmaller{
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            ans[i] = count;
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
