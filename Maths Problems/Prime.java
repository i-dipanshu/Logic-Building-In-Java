public class Prime {
    public static void main(String[] args) {
        int[] check = { 1, 2, 3, 4, 5, 78, 213, -1, 90, 47, 53 };
        
        for (int n : check) {
            if(isPrime(n)){
                System.out.print(n + " ");
            }
        }
    }

    static boolean isPrime(int n) {
        // numbers less than 1 are not prime.
        if (n <= 1) {
            return false;
        }

        // checking between 1 and sqrt(n)
        // it prevents the repition of checking the same no twice.
        int sqrt = 2;
        while (sqrt * sqrt <= n) {
            if (n % sqrt == 0) {
                return false;
            }
            sqrt += 1;
        }

        return true;
    }
}
