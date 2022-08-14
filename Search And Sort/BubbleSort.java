import java.util.Arrays;

public class BubbleSort {
    static int [] bubbleSort(int [] arr){
        int [] temp = arr;
        int n = temp.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1 ; j++){
                if (temp[j] > temp[j + 1]) {
                    int t = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = t;
                }
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, -23, 45, 12, -89};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
