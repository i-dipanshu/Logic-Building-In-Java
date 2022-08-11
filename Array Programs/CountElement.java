public class CountElement {
    static int count(int [] arr, int key){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 1, 1, 2, 4, 1, 3, 1, 89, 1};
        int key = 1;
        System.out.println("Frequency of '" + key + "' = " + count(arr, key));
    }
}
