import java.util.Arrays;

public class CopyArray {
    static int [] copyArray(int [] arr){
        int [] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(copyArray(arr)));
    }
}
