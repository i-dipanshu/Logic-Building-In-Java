public class Fibonacci{
    static int Fibo(int n){
        // corner case
        if(n == 0){
            return 0;
        }
        // recursion chain breaker
        if(n == 1){
            return 1;
        }
        return Fibo(n-1) + Fibo(n-2);
    }
    public static void main(String[] args) {
        int count = 10;
        for(int i = 0; i <= count; i++){
            System.out.print(Fibo(i) + "  ");
        }
    }
}