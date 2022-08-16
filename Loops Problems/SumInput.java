import java.util.Scanner;

public class SumInput {
    static void add() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the numbers: ");
        while (true) {
            int in = sc.nextInt();
            if (in == 0) {
                break;
            }
            sum += in;
        }
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        add();
    }
}