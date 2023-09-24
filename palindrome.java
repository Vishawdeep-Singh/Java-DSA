import java.util.*;
public class palindrome {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = sc.nextInt();
    if (Palindrome(number)) {
       System.out.println("Number is palindrome"); 
    } else {
        System.out.println("Number is not Palindrome");
    }
    }
    public static boolean Palindrome(int number) {
        int paLindrome= number;
        int rev = 0 ; 
        while (paLindrome!=0) {
            int remainder = paLindrome%10;
            rev = (rev*10)+remainder;
            paLindrome = paLindrome/10;

        }
        if (rev == number) {
            return true;
        } else {
            return false;
        }
    }
}
