import java.util.Scanner;

public class Print_MAX_MIN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        // max(sc.nextInt(), sc.nextInt(), sc.nextInt());
        min(sc.nextInt(), sc.nextInt(), sc.nextInt());
        sc.close();
    }
    static void max(int a, int b, int c){
        int[] arr = {a, b, c};
        int largest = a;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest = " + largest);

    }
    static void min(int a, int b, int c){
        int[] arr = {a, b, c};
        int smallest = a;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest = " + smallest);

    }
}
