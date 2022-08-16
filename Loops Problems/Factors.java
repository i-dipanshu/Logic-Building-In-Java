public class Factors {
    static void factors(int n){
        System.out.print("Factors are = ");
        for (double i = 1; i <= n; i++) {
            double div = n / i;
            if(div - Math.floor(div) == 0){
                System.out.print((int)i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int n = 54;
        factors(n);
    }
}
