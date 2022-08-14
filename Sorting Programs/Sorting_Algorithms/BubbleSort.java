package Sorting_Algorithms;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void optimisedBubbleSort(int[] arr) {
        int n = arr.length, i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false) {
                break;
            }
        }
    }

    static void bubbleSortRecursively(int arr[], int n) {
        if (n == 1) {
            return;
        }
        // puts the largest element at its postion at each iteration
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleSortRecursively(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -1, -9, 0, 34, 5, 7, -9 };
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        // optimisedBubbleSort(arr);
        // bubbleSort(arr);
        bubbleSortRecursively(arr, n);

        System.out.println(Arrays.toString(arr));
    }
}
