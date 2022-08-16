public class Factorial {
    static void factorial(int n){
        if(n == 0){
            System.out.println("Factorial = 1 ");
            return;
        }
        int fact = 1;
        while(n > 1){
            fact *= n;
            n--;
        }
        System.out.println("Factorial = " + fact);
    }
    public static void main(String[] args) {
        int n = 5;
        factorial(n);
    }
}
