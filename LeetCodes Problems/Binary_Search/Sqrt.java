package Binary_Search;

public class Sqrt{
    public static void main(String[] args) {
        long n = 1000000;
        System.out.println(sqrt(n));
        System.out.println(sqrtBinary(n));
        System.out.println(test(n));
    }
    
    // brute force method - not optimized - linear time complexity
    // just linear search
    static long sqrt(long n){
        for(long i = 0; i <= n; i++){
            if(i * i <= n && (i + 1) * (i + 1) > n){
                return i;
            }
        }
        return -1;
    }

    // log(n) 
    static long sqrtBinary(long x){
        if (x == 0) return 0;

        long s = 1, e = x;

        while (s <= e) {
            long mid = s + (e - s) / 2;

            if (mid <= x / mid && (mid + 1) > x / (mid + 1))
                return mid;
            else if (mid < x / mid) {
                s = mid + 1;
            } else
                e = mid;
        }
        return s;
    }

    static long test(long n){
        if( n == 0){
            return 0;
        }
        long s = 1, e = n;

        while(s <= e){
            long mid = s + (e - s)/2;

            if(mid  == n / mid){
                return mid;
            }else if(mid > n / mid){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return e;
    }
}


