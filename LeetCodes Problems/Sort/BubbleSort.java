package Sort;

import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubble_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // optimized solution
    // returns the array after sorting

    static void bubble_Sort(int[] arr){
        // to check if swap occurred or not
        boolean swapped;

        // runs n - 1 times for the only element left 
        // it would be already sorted

        for(int i = 0; i < arr.length - 1; i++){
            // initial value 
            swapped = false;

            // runs n - i times since last i elements 
            // will be at its right position after i iteration
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j + 1] < arr[j]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // if swapped is false ie; no swapped occurred
            if(!swapped){
                break;
            }
        }


    }
    
}