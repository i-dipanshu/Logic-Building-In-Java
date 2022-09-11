package Binary_Search;
public class BinarySearch{
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr = {9, 7, 6, 5, 4, 3, 2, 1};
        int key = 4;
        // System.out.println(binarySearchAscending(arr, key));
        System.out.println(binarySearchDescending(arr, key));
    }

    // return the index of element found 
    // or -1 if not found
    static int binarySearchAscending(int[] arr, int key){
        // intial bounds
        int start = 0, end = arr.length - 1;
        
        // loop terminates if start start exceeds the end
        while(start <= end){
            // bound will update at each iteration
            // not used mid = (start + end) / 2
            // bc it may exceed integer limits
            int mid = start + (end - start)/ 2;

            // for the search in second half subarray
            if(key > arr[mid]){
                start = mid + 1;
            }

            // for the search in first half subarray
            if(key < arr[mid]){
                end = mid - 1;
            }

            // if the element is found
            if(key == arr[mid]){
                return mid;
            }
        }
        // if loop breaks ie; start = mid + 1 = end + 1
        // element not found
        return -1;
    }

    static int binarySearchDescending(int[] arr, int key){
        int start = 0, end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            // for the search in first subarray
            if(key > arr[mid]){
                end = mid - 1;
            }

            // for the search in second subarray
            if(key < arr[mid]){
                start = mid + 1;
            }

            // if element found
            if(key == arr[mid]){
                return mid;
            }
        }
        // if loop terminates ie; 
        // end = mid - 1
        // element not found
        return -1;
    }
}