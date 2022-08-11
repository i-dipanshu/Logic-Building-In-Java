public class Sunny {

    static boolean sunny(int num){
        num ++;
        double sqrt = Math.sqrt(num);
        if((sqrt - Math.floor(sqrt)) == 0){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            if(sunny(i)){
                System.out.print(i + " ");
            }
        }
    }
}
