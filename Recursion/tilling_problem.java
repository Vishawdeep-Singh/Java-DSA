package Recursion;

public class tilling_problem {
    public static int tilling(int n) {
        if (n==0 || n==1) {
            return 1;
        }
        int fnm1= tilling(n-1);//vertical choice
        //horizontal choice
        int fnm2 = tilling(n-2);

        int total_ways= fnm1 + fnm2 ;
        return total_ways;

    }
    public static void main(String[] args) {
        System.out.println(tilling(4));
    }
}
