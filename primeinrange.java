import java.util.*;
public class primeinrange {
    public static boolean Isprime(int n) {
        boolean Isprime=true;
        for (int i = 2; i <= n-1; i++) {
            if (n%i==0) {
                
                Isprime=false;
                
            }
            
        }
        return Isprime;
        
    }
    public static void Primeinrange(int n) {
        for (int i = 2; i <= n; i++) {
            if(Isprime(i)){
                System.out.println(i + " ");
            }
            
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Primeinrange(10);
        
    }
}
