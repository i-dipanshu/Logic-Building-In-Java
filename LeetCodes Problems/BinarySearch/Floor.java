package BinarySearch;

public class Floor {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 11, 14, 16, 110 };
        int target = -12123;

        System.out.println(ceil(arr, target));
    }

    static int ceil(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = (s + (e - s) / 2);

            if (arr[mid] == target) {
                return arr[mid];
            }

            if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return e < 0 ? -1 : arr[e];
    }
}
