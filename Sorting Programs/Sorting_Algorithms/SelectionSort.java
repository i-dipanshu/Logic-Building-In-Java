package Sorting_Algorithms;

import java.util.Arrays;

public class SelectionSort{
    static void selectionSort(int [] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int min_index = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[min_index] > arr[j]){
                    min_index = j;
                }
            }
            int min_value = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = min_value;

        }
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 45, -7, 43, 3}; 
        System.out.println(Arrays.toString(arr));  
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
     }
}