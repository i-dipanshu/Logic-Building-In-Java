package Sorting_Algorithms;

import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int[] arr) {
        int n = arr.length, i = 0, j,key;
        for(j = 1; j < n; ++j){
            key = arr[j];
            i = j - 1;
            while(i > -1 && arr[i] > key){
                arr[i + 1] = arr[i];
                i --;
            }
            arr[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 5, -1};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
