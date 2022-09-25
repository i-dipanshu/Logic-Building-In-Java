package Array_Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 2;
        System.out.println(linearSearch(arr, 0, target));
    }

    private static boolean linearSearch(int[] arr, int i, int target){
        if(i > arr.length - 1){
            return false;
        }
        return target == arr[i] || linearSearch(arr, i + 1, target);
    }
}