public class Frequency {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 3, 1, 2 };
        System.out.println(ans(arr));
    }

    static int ans(int[] arr) {
        int ans = 0;
        for (int n : arr) {
            // it like adding 1 + 2 + 3 + 4 - 3 - 2 - 1 = 4
            // only element which occurs odd no. of times
            ans ^= n;
        }
        return ans;
    }
}
