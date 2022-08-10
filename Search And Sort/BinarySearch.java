public class BinarySearch {
    static void binarySearch(int[] arr, int first, int last, int key) {
        // Array must be sorted in binary search
        // corner case
        if (key > last || key < first) {
            System.out.println("Element not found");
            return;
        }
        while (arr[first] <= arr[last]) {
            int mid = (first + last) / 2;
            if (arr[mid] == key) {
                System.out.println("Element '" + key + "' found at index = " + mid);
                return;
            } else if (arr[mid] < key) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        System.out.println("Element not found");
    }

    static int binaryRecursion(int[] arr, int first, int last, int key) {
        if (key > arr[last] || key < arr[first]) {
            return -1;
        }
        int mid = (first + last) / 2;
        // base case
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] < key) {
            return binaryRecursion(arr, mid + 1, last, key);
        } else if (arr[mid] > key) {
            return binaryRecursion(arr, first, mid - 1, key);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int key = 5;
        binarySearch(arr, 0, arr.length - 1, key);

        int store = binaryRecursion(arr, 0, arr.length - 1, key);
        if(store == -1){
            System.out.println("Element not found.");
        }
        else{
            System.out.println("Element found at index = " + store);
        }
    }
}
