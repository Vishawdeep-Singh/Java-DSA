package Recursion;
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        int n=3;

        calculate(n,"S","H","D");
    }
    public static void calculate(int n , String src,String hpr,String dest) {
        if(n==1){
            System.out.println("transfer" + "disk" +n+ "from" + src + "to" + dest);
            return;
        }
        calculate(n-1, src, dest, hpr);
        System.out.println("transfer" + "disk" +n+ "from" + src + "to" + dest);
        calculate(n-1, hpr, src, dest);

    }
}
