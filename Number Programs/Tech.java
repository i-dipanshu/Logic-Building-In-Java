public class Tech {
    static boolean tech(int n){
        int temp = n, digits = 0;
        // counting the digits
        while(n > 0){
            digits ++;
            n /= 10;
        }
        if(digits % 2 != 0){
            return false;
        }

        n = temp;

        int lastHalf = n % (int)Math.pow(10, digits / 2);
        int firstHalf = n / (int)Math.pow(10, digits / 2);

        return Math.pow((lastHalf + firstHalf), 2) == temp;
    }
    public static void main(String[] args) {
        for(int i = 0; i < 10000; i++){
            if(tech(i)){
                System.out.print(i + "  ");
            }
        }
    }
}
