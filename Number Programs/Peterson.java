public class Peterson {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static boolean peterson(int num) {
        int n = num;
        int temp = 0;
        int sum = 0;
        while (num > 0) {
            temp = num % 10;
            sum += factorial(temp);
            num /= 10;
        }
        return sum == n;

    }

    public static void main(String[] args) {
        for(int i = 0; i < 100000; i++){
            if(peterson(i)){
                System.out.print(i + "  ");
            }
        }
    }
}
