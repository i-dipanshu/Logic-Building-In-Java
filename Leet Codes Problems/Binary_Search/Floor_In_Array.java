package Binary_Search;

public class Floor_In_Array {
    // problem is find the element equal to target 
    // or element just smaller than target in sorted array
    public static void main(String[] args) {
        int target = 11; 
        int[] arr = {1, 3, 8, 12, 18, 16};
        System.out.println(floor(arr, target, true));
        int[] arr1 = {42, 23, 20, 15, 8, 4, 1};
        System.out.println(floor(arr1, target, false));
        

    }
    // we know when loop terminates ie;
    // element not found and end = mid - 1
    // which is nothing but element just smaller
    // than target

    static int floor(int[] arr,int target, boolean isAscending){
        int start = 0, end = arr.length - 1;

        // check for smallest target value for ascending
        if(target < arr[0] && isAscending){
            return -1;
        }
        // check for smallest target value for descending
        if(target < arr[arr.length - 1] && !isAscending){
            return -1;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                if(isAscending) end = mid - 1;
                else start = mid + 1;
            }

            if(target > arr[mid]){
                if(isAscending) start = mid + 1;
                else end = mid - 1;
            }

            if(target == arr[mid]){
                return arr[mid];
            }
        }
        // loop terminates, element not found
        // time to return floor ie
        if(isAscending) return arr[end];
        else return arr[start];
    }
}
