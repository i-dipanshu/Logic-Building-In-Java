public class Palindrome_No{
    static void palindrome(int n){
        int sum = 0, rem = 0;
        while(n > 0){
            rem = n % 10;
            sum = sum * 10 + rem;
            n /= 10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int n = 3432;
        palindrome(n);
    }
}
