package Sort;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int last = arr.length - i - 1;
            int maxIndex = 0;
            for (int j = 0; j < last; j++) {
                if(arr[j] < arr[j + 1]){
                    maxIndex = j + 1;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
            
        }
    }
}
