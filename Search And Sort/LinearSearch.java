public class LinearSearch{
    static void linearSearch(int [] arr, int searchkey){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == searchkey){
                System.out.println("Element '" + searchkey + "' Found at index = " + i);
                return;
            }
        }
        System.out.println("Element not found.");
    } 
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        int searchkey = 3;
        linearSearch(arr, searchkey);
    }
}