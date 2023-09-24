package Recursion;

public class factorial {
    public static int fact(int n) {
        if (n==0) {
            return 1;
        }
        int FactNm1= fact(n-1);
        int FactN = n * fact(n-1);
        return FactN;
    
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(fact(n));
    }
}
