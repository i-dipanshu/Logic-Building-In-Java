public class CountString {
    static int count(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count("C:Program FilesJavajdk-17.0.2binjava.exe"));
    }
}
