public class printNumbers {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
    // 1 --> n or n --> 1
    static void print(int n) {
        if(n == 0){
            return;
        }
        // number gets printed first and then another function is called
        // System.out.print(n + " ");
        // print(n - 1);

        // function is stored in stack one after another until it reaches base conditon
        // and then it removed from top --> 1, 2, 3, 4, 5 are poped 
        print(n - 1);
        System.out.print(n + " ");
    }
}