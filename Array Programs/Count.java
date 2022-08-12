public class Count {
    static int countAll(int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
                count++;
        }
        return count;
    }

    static int countElement(int [] arr, int key){
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
        System.out.println(countAll(arr));
        int key = 1;
        System.out.println("Frequency of '" + key + "' = " + countElement(arr, key));
    }
}
