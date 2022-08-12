public class LargestElement {
    static int largest(int [] arr){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    static int largestBubble(int [] arr){
        int temp = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i + 1] > temp){
                temp = arr[i + 1];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int [] arr = {-1, 52, -3, 0, 1};
        System.out.println("Largest element = " + largest(arr));
        System.out.println("Largest element = " + largestBubble(arr));
        
    }
}
