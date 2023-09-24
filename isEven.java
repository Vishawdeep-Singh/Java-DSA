import java.util.*;
public class isEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive integer");
        int n = sc.nextInt();
       if (IsEven(n)) {
        System.out.println("Number is even");
       } else {
        System.out.println("Number is odd");
       }


    }
    public static boolean IsEven(int n) {
        if (n%2==0) {
            return true;
        } else {
            return false;
        }
    }
}
