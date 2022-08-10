public class Ascii {
    public static void main(String[] args) {
        char c1 = 'a';
        int ascii = c1; // no typecasting needed
        char c2 = (char)(ascii); // typecasting needed
        System.out.println(c1 + " --> " + ascii);
        System.out.println(ascii + " --> " + c2);
    }
}
