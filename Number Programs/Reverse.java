public class Reverse {
    static void reverseRecr(int n) {
        if (n > 0) {
            System.out.print(n % 10);
            reverseRecr(n / 10);
        }
    }

    static int reverse(int n) {
        int sum = 0, rem;
        while (n > 0) {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n /= 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        reverseRecr(123456);
        System.out.println();
        System.out.println(+ reverse(654321));
    }
}
