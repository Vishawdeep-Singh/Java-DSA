package Recursion;

public class fibonacci {
    public static int fib(int n) {
        if (n==0 || n==1) {
            return n ;
        }
        int FibNm2= fib(n-2);
        int FibNm1 = fib(n-1);
        int FibN = FibNm1 + FibNm2;
        return FibN;

    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(fib(n));
    }
}
