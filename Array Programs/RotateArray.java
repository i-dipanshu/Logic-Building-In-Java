import java.util.Arrays;

public class RotateArray {
    static void leftRotate(int [] arr, int rotate){
        for(int i = 0; i < rotate; i++){
            int j, first;
            first = arr[0];

            for(j = 0; j < arr.length - 1; j++){
                arr[j] = arr[j + 1];
            }
            arr[j] = first;
        }
    }
    static void rightRotate(int [] arr, int rotate){
        for(int i = 0; i < rotate; i++){
            int j , last;
            last = arr[arr.length - 1];
            for(j = arr.length - 1; j > 0; j--){
                arr[j] = arr[j - 1];
            }
            arr[j] = last;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        leftRotate(arr, 1);
        System.out.println(Arrays.toString(arr));
        rightRotate(arr, 1);
        System.out.println(Arrays.toString(arr));

    }
}
