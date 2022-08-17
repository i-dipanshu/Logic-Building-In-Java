public class PythgorianTriplet {
    static boolean triplet(int x, int y, int z){
        int a = x * x;
        int b = y * y;
        int c = z * z;

        if(a + b == c){
            return true;
        }
        else if(a + c == b){
            return true;
        }
        else if(b + c == a){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(triplet(3, 4, 5));
    }
}
