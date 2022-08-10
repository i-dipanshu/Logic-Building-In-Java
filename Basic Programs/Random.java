public class Random {
    static int Randm(int max, int min){
        return (int)(Math.random()*(max - min + 1) + min);
    }
    public static void main(String[] args) {
        System.out.println(Randm(30, 10));
    }
}
