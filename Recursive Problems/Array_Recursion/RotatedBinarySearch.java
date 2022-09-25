package Array_Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int target = 5;
        System.out.println(search(arr, target, 0, arr.length - 1));

    }

    static int search(int[] arr, int target, int s, int l){
        if(s > l){
            return -1;
        }

        int m = s + (l - s) / 2;

        if(arr[m] == target){
            return m;
        }

        if(arr[s] < arr[m]){
            if(arr[s] <= target && arr[m] >= target){
                return search(arr, target, s, m - 1);
            }
            return search(arr, target, m + 1, l);
        }

        if(arr[m] <= target && arr[l] >= target){
            return search(arr, target, m + 1, l);
        }

        else {
            return search(arr, target, s, m - 1);
        }        
    }
}
