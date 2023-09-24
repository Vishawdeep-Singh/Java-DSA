import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = sc.nextInt();
        System.out.println("sum is" + Sumofdigits(n));

    }
    public static int Sumofdigits(int n) {
        int sum=0;
        while (n>0) {
            int LD = n%10;
            sum = sum + LD;
            n=n/10;
        }
        return sum;
    }
}
