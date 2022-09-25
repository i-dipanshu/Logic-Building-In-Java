package Basic_Recursion;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 89067;
        System.out.println(reverse(n));
    }
    
    private static int reverse(int n){
        if(n == n % 10){
            return n;
        }
        int digits = (int)Math.log10(n) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n == n %10){
            return n;
        }
        return ( n % 10 ) * (int)Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }
}
