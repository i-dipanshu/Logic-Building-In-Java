public class Armstrong{
    static int Arms(int n){
        int temp = n, armS = 0, digits = 0;
        // counts no. of digits 
        while(temp > 0){
            digits ++;
            temp /= 10;
        }
        temp = n;
        // finding the armstrong
        while(temp > 0){
            armS += Math.pow(temp%10, digits);
            temp /= 10;
        }
        if(n == armS){
            return armS;
        }
        return -1;
    }
    public static void main(String[] args) {
        int limit = 100000;
        for(int i = 0; i < limit; i++){
            if(Arms(i) != -1){
                System.out.print(Arms(i) + " ");
            }
        }
    }
}