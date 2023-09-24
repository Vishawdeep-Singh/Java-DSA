package Recursion;
import java.util.*;
public class power_print{
    public static int powe( int x , int n) {
        if (n==0) {
            return 1;
        }
        int xNm1 = powe(x, n-1);
int xn = x *xNm1;
return xn;
    }

    public static void main(String[] args) {
        System.out.println(powe(5, 3));
        
    }
}
