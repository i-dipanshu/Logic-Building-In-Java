import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int [] arr){
        for(int i = 0; i < arr.length; i++){
            int index = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[index] > arr[j]){
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

   
    public static void main(String[] args) {
        int [] arr = {1, 23, -2, -45, 6, 0};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
