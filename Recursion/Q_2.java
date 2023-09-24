package Recursion;


public class Q_2 {
    static String digits[]= {"zero" , "one" , "two" ,"three" , "four" , "five" , "six" , "seven" , "eight" ,"nine"};
    public static void convert(int n) {
        if (n==0) {
            return;
        }
        int lastDigit= n%10;
        convert(n/10);
        System.out.println(digits[lastDigit] + " ");

    }
    public static void main(String[] args) {
        convert(1233);
    }
}
