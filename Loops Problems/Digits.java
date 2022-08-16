// Subtract the Product and Sum of Digits of an Integer -- LeetCode
public class Digits {
    static void sum_mul(int n){
        int sum = 0, rem, mul = 1;

        while (n > 0) {
            rem = n % 10;
            sum += rem;
            mul *= rem;
            n /= 10;
        }
        System.out.println("Sum of digits = " + sum);
        System.out.println("Multiplication of digits = " + mul);
    }
    public static void main(String[] args) {
        int n = 1234;
        sum_mul(n);
    }
}
