public class PrimeNumber {
    static boolean checkPrime(int n){
        // corner case
        if(n == 0 || n == 1){
            return false;
        }
        // prime number condition.
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 6;
        System.out.println(num + " is prime --> " + checkPrime(num));

        System.out.println("Printing prime numbers between two numbers: ");
        int from = 1, to = 50;

        for(int i = from; i <= to; i++){
            if(checkPrime(i)){
                System.out.print(i + "  ");
            }
        }
    }
}
