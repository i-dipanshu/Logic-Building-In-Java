public class Reverse {
    public static void main(String[] args) {
        int n = 4562;
        reverse(n);
    }

    static void reverse(int n){
        if(n == 0){
            return;
        }
        System.out.print(n % 10);
        reverse(n / 10);
    }
}
