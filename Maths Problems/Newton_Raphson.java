public class Newton_Raphson {
    public static void main(String[] args) {
        int n = 45;
        System.out.printf("%.3f \n", Math.sqrt(n));
        System.out.printf("%.3f", sqrt(n));
    }

    private static double sqrt(int n) {
        double x = n;
        double root;

        while (true) {
            root = 0.5 * (x + (n / x));
            if(Math.abs(root - x) < 0.1){
                break;
            }
            x = root;
        }
        return root;
    }
}
