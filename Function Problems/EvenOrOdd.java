public class EvenOrOdd {
    static boolean evenOrOdd(int n){
        if(n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 34;
        boolean s = evenOrOdd(n);
        if(s){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}
