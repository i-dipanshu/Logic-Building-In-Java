public class PrintArray {
    static void print(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
    }

    static void printReverse(int [] arr){
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + "  ");
        }
    }

    static void printEven(int [] arr){
        for(int i = 0; i < arr.length; i++){
            if(i % 2 != 0){
                System.out.print(arr[i] + "  ");
            }
        }
    }

    static void printOdd(int [] arr){
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                System.out.print(arr[i] + "  ");
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3 ,4, 5, 6, 7, 8, 9, 10};
        print(arr);
        System.out.println();
        printEven(arr);
        System.out.println();
        printOdd(arr);
        System.out.println();
        printReverse(arr);
    }
}
