import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int [] array){
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
    public static void main(String[] args) {
        int [] arr = {5, 4, 3, 1, 2};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
