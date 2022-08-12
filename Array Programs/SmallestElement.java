public class SmallestElement {
    static int smallest(int [] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2 ,-47, -89};
        System.out.println(smallest(arr));
    }
}
