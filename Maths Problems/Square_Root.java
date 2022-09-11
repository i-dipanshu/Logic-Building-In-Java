public class Square_Root {
    public static void main(String[] args) {
        int n = 45;
        int p = 3;
        System.out.printf("%.3f \n", Math.sqrt(n));
        System.out.printf("%.3f",sqrt(n, p));
    }

    private static double sqrt(int n, int p) {
        double root = 0.0;
        int s = 0, e = n;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m * m == n) {
                return m;
            }

            if (m * m < n) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }

        double incr = 0.1;
        while (p > 0) {
            while(root * root <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
            p -= 1;
        }

        return root;
    }

}
