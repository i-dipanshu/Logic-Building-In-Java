import java.util.Arrays;

public class BubbleSort {
    static int [] bubbleSort(int [] arr){
        int [] temp = arr;
        for(int i = 0; i < temp.length; i++){
            for(int j = i + 1; j < temp.length; j++){
                if (temp[i] > temp[j]) {
                    int t = temp[i];
                    temp[i] = temp[j];
                    temp[j] = t;
                }
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int [] arr = {76, 34, 56, -23, 45, 12, 89};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
