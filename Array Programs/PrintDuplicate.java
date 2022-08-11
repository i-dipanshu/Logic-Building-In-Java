public class PrintDuplicate {
    static void printDuplicate(int [] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 1, 2, 3, 1};
        printDuplicate(arr);
    }
}
