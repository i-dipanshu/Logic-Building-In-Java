package Array_Problems;

import java.util.ArrayList;

public class CandyProblem {
    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        ArrayList<Boolean> ans = new ArrayList<>(n);
        int largest = candies[0];
        for(int i = 1; i < n; i++){
            if(candies[i] > largest){
                largest = candies[i];
            }
        }
        for(int i = 0; i < n; i++){
            ans.add(candies[i] + extraCandies >= largest);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] candies = {1, 2, 3, 4};
        int extraCandies = 2;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
