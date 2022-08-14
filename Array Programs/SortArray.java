import java.util.Arrays;

public class SortArray {
    static void bubbleSort(int [] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void insertionSort(int [] arr){
        for(int j = 1; j < arr.length; j++){
            int i = j - 1;
            int key = arr[j];
            while(i > -1  &&  arr[i] > key){
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }

    static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int [] arr = {7, 6, 5, 4, 3, 2, 1};
        bubbleSort(arr);
        // insertionSort(arr);
        // insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
