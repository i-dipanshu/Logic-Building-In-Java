package Array_Recursion;

import java.util.ArrayList;

public class Occurrence {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 4, 2};
        int target = 2;

        // index(arr, 0, target);
        // System.out.println(a1.toString());

        // ArrayList <Integer> a2 = new ArrayList<>();
        // System.out.println(indexList(arr, 0, target, a2).toString());

        System.out.println(getOccurrences(arr, 0, target).toString());
    }

    // storing the indices of target in an arraylist
    static ArrayList<Integer> a1 = new ArrayList<>();

    // Recursive Linear search
    static int index(int[] arr, int i, int target){
        if(i > arr.length - 1){
            return -1;
        }
        if(arr[i] == target) {
            a1.add(i);
        }
        return index(arr, i + 1, target);
    }

    // optimized | returning list
    static ArrayList<Integer> indexList(int[] arr, int i, int target, ArrayList<Integer> a2){
        if (i > arr.length - 1) {
            return a2;
        }
        if (arr[i] == target) {
            a2.add(i);
        }
        return indexList(arr, i + 1, target, a2);
    }

    // not taking list in args
    static ArrayList<Integer> getOccurrences(int[] arr, int i, int target){
        ArrayList<Integer> l1 = new ArrayList<>();

        if (i > arr.length - 1) {
            return l1;
        }
        if (arr[i] == target) {
            l1.add(i);
        }
        
        ArrayList<Integer> l2 = getOccurrences(arr, i + 1, target);

        l1.addAll(l2);

        return l1;
    }
}

