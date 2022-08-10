public class Palindrome {
    // Method 1 : check palindrome
    static boolean palinNum(int n) {
        int r, sum = 0, temp = n;

        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n /= 10;
        }

        if (temp == sum) {
            return true;
        }
        return false;
    }

    // reverse a given num
    static void printReverse(int n) {
        if (n > 0) {
            System.out.print(n % 10);
            printReverse(n / 10);
        }
    }

    // reverse a given string
    static String palinString(String s) {
        String newStr = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            newStr = newStr + s.charAt(i);
        }
        return newStr;
    }

    public static void main(String[] args) {
        printReverse(344);
        System.out.println();
        System.out.println(palinString("afifa"));
    }
}
