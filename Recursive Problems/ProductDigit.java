public class ProductDigit {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(product(n));
    }

    static int product(int n){
        if(n == n % 10){
            return n;
        }
        return n % 10 * product(n / 10);
    }
}
