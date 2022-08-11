public class Automorphic {

    static boolean automorphic(int n) {
        int sqr = n * n;
        while (n > 0) {
            if (sqr % 10 != n % 10) {
                return false;
            }
            n /= 10;
            sqr /= 10;
        }
        return true;
    }


    public static void main(String[] args) {
        for(int i = 0; i < 100000; i++){
            if(automorphic(i)){
                System.out.println(i + " --> " + (i * i));
            }
        }
    }
}