package Basic_Recursion;
public class AddDigits {
    public static void main(String[] args) {
        int n = 912;
        System.out.println(sum(n));
        System.out.println(n);
    }
    // +ve numbers
    static int sum(int n){
        // if(n == 0){
        //     return 0;
        // }
        if (n == n % 10) {
            return n;
        }
        return n % 10 + sum(n / 10);
    }
}
