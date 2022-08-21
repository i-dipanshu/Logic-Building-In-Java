package Binary_Search;

public class FloorInCharArray {
   
    public static void main(String[] args) {
        char[] arr = { 'c', 'f', 'j', 'k', 'y' };
        char target = 'a';

        System.out.println(floor(arr, target));
    }

    static char floor(char[] arr,char target){
        int s = 0, e = arr.length - 1;

        if(target < arr[0]){
            return arr[e];
        }

        while(s <= e){
            int mid = s + (e - s) / 2;

            if(target == arr[mid]){
                return arr[e];
            }

            if(target > arr[mid]){
                s = mid + 1;
            }

            if(target < arr[mid]){
                e = mid - 1;
            }

        }
        return arr[e];
    }
}
