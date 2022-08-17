import java.util.Scanner;

public class PrintLargest {
    static void largest(){
        int largest = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers :");
        while(true){
            int in = sc.nextInt();
            if(in == 0){
                break;
            }
            if(in > largest){
                largest = in;
            }
        }
        System.out.println("Largest = " + largest);
        sc.close();
    }
    public static void main(String[] args) {
        largest();
    }
}
