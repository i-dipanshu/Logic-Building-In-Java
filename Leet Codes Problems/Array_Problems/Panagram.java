package Array_Problems;

public class Panagram {
    static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        String alphabets = "abcdefghijklmniopqrstuvwxyz";
        for (int i = 0; i < alphabets.length(); i++) {
            if (sentence.indexOf(alphabets.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }
}
