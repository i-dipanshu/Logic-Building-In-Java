package Binary_Search;

public class Sqrt{
    public static void main(String[] args) {
        int n = 101;
        System.out.println(sqrtBinary(n));
        System.out.println(sqrt(n));
    }
    
    // brute force method - not optimized - linear time complexity
    // just linear search
    static int sqrt(int n){
        for(int i = 0; i < n; i++){
            if(i * i <= n && (i + 1) * (i + 1) > n){
                return i;
            }
        }
        return -1;
    }

    // log(n) 
    static int sqrtBinary(int x){
        if (x == 0) return 0;

        int s = 1, e = x;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid <= x / mid && (mid + 1) > x / (mid + 1))
                return mid;
            else if (mid < x / mid) {
                s = mid + 1;
            } else
                e = mid;
        }
        return s;
    }
}


