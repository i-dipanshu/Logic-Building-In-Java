package Array_Recursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2};
        int index = 0;
        System.out.println(sortedLinear(arr, index));
    }

    // Linear 
    private static boolean sortedLinear(int[] arr, int index){
        if(index == arr.length -1){
            return true;
        }
        return arr[index] < arr[index + 1] && sortedLinear(arr, index + 1);
    }
}
