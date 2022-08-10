public class Factorial {
    static int Fact(int n){
        // recursion loop breaker
        if(n == 1){
            return 1;
        }
        return n * Fact(n-1);
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is = " + Fact(num) );
    }
}
