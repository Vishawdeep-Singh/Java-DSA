package Recursion;

public class friends_pairing {
    public static int friends(int n) {
        if (n==2 || n==1) {
            return n;
        }
        //choice
        //single
        int Fnm1=friends(n-1);

        //pair
        int Fnm2 =friends(n-2);
        int pairways= (n-1)*Fnm2;

        // totways
        int totways= Fnm1 + pairways;

        return totways;
    }
    public static void main(String[] args) {
        System.out.println(friends(3));
    }
}
