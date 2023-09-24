package Recursion;

public class sum_1_to_n {
    public static int print_sum(int n) {
        if (n==1) {
            return 1 ;
        }
        int SnM1= print_sum(n-1);
        int S = n + SnM1;
        return S;
    }
    public static void main(String[] args) {
        int n = 10 ; 
    System.out.println(print_sum(n));
    }
}
