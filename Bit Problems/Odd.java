public class Odd {
    public static void main(String[] args) {
        int num = 60;
        System.out.println(getOdd(num));
    }

    static boolean getOdd(int n) {
        // xor with 1 gives 1 if the last bit is 1 --> which defines the no. is odd
        // last bit is called least significant bit
        if ((n & 1) == 1) {
            return true;
        }
        return false;
    }
}